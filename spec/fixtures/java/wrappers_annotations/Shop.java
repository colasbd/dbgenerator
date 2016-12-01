package fr.ganfra.realm;

import io.realm.RealmList;
import io.realm.RealmObject;

/* DO NOT EDIT | Generated by dbgenerator */

public class Shop extends RealmObject {

    public interface Attributes {
        String NAME = "name";
    }

    public interface Relationships {
        String PRODUCTS = "products";
    }

    private String name;
    private RealmList<Product> products;

    @android.support.annotation.NonNull
    public String getName() {
        return name;
    }

    public void setName(@android.support.annotation.NonNull final String name) {
        this.name = name;
    }

    @android.support.annotation.Nullable
    public RealmList<Product> getProducts() {
        return products;
    }

    public void setProducts(@android.support.annotation.Nullable final RealmList<Product> products) {
        this.products = products;
    }
}
