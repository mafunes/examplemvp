package com.example.mafunes.examplemvp.search;

import java.io.Serializable;

/**
 * Created by mafunes on 7/7/15.
 */
public class Item implements Serializable {
    public final String title;

    public Item(String title) {
        this.title = title;
    }

}
