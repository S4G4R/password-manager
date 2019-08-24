package com.sagar.passwordmanager.controllers;

import com.sagar.passwordmanager.configuration.DatabaseConfiguration;
import com.sagar.passwordmanager.persistent.Account;
import com.sagar.passwordmanager.persistent.Provider;
import com.sagar.passwordmanager.persistent.User;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import org.apache.cayenne.CayenneContext;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.CayenneRuntime;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.ObjectSelect;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private ObjectContext context;

    @FXML
    private ListView providers;

    @FXML
    private ListView accounts;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.context = DatabaseConfiguration.context;
        populateProviders();
    }

    // Triggers when a provider is selected, causing the account list to be refreshed.
    @FXML
    public void providerSelected(MouseEvent arg0) {
        String selectedProviderName = providers.getSelectionModel().getSelectedItem().toString();
        refreshAccounts(selectedProviderName);
    }

    // Populates list of providers.
    public void populateProviders() {
        List<Provider> userProviders = ObjectSelect.query(Provider.class).select(context);

        if (userProviders == null) return;

        for (Provider provider : userProviders) {
            providers.getItems().add(provider.getName());
        }

        providers.refresh();
    }

    // Displays accounts of a specific selected provider.
    public void refreshAccounts(String providerName) {
        List<Account> userAccounts = ObjectSelect.query(Account.class)
                .where(Account.PROVIDER.dot(Provider.NAME).eq(providerName))
                .select(context);

        if (userAccounts == null) return;

        accounts.getItems().clear();

        for (Account account : userAccounts) {
            accounts.getItems().add(account.getEmail());
        }

        accounts.refresh();
    }


}
