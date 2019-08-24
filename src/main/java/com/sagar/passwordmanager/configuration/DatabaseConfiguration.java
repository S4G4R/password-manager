package com.sagar.passwordmanager.configuration;

import com.sagar.passwordmanager.persistent.Account;
import com.sagar.passwordmanager.persistent.Provider;
import com.sagar.passwordmanager.persistent.User;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;

public class DatabaseConfiguration {

    public static ObjectContext context;

    public DatabaseConfiguration() {
        setUpDatabase();
        testing();
    }

    private void setUpDatabase() {
        ServerRuntime cayenneRuntime = ServerRuntime.builder()
                .addConfig("cayenne-project.xml")
                .build();
        this.context = cayenneRuntime.newContext();
    }

    private void testing() {
        // MOCK DATABASE TESTS
//        User sagar = context.newObject(User.class);
//        sagar.setName("Sagar");
//        sagar.setMasterPassword("123");
//
//        Provider fb = context.newObject(Provider.class);
//        fb.setName("Facebook");
//        fb.setUser(sagar);
//
//        Provider tw = context.newObject(Provider.class);
//        tw.setName("Twitter");
//        tw.setUser(sagar);
//
//        Provider go = context.newObject(Provider.class);
//        go.setName("Google");
//        go.setUser(sagar);
//
//        Account testGo = context.newObject(Account.class);
//        testGo.setEmail("sagarvrajalal@gmail.com");
//        testGo.setPassword("123");
//        testGo.setProvider(go);
//
//        Account testTwitter = context.newObject(Account.class);
//        testTwitter.setEmail("sagarvrajalal@twitter.com");
//        testTwitter.setPassword("123");
//        testTwitter.setProvider(tw);

//        context.commitChanges();
    }

}
