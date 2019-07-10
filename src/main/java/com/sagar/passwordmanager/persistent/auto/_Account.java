package com.sagar.passwordmanager.persistent.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.sagar.passwordmanager.persistent.Provider;

/**
 * Class _Account was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Account extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> EMAIL = Property.create("email", String.class);
    public static final Property<String> PASSWORD = Property.create("password", String.class);
    public static final Property<Provider> PROVIDER = Property.create("provider", Provider.class);

    public void setEmail(String email) {
        writeProperty("email", email);
    }
    public String getEmail() {
        return (String)readProperty("email");
    }

    public void setPassword(String password) {
        writeProperty("password", password);
    }
    public String getPassword() {
        return (String)readProperty("password");
    }

    public void setProvider(Provider provider) {
        setToOneTarget("provider", provider, true);
    }

    public Provider getProvider() {
        return (Provider)readProperty("provider");
    }


}
