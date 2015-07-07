package com.example.mafunes.examplemvp.search;

import java.io.Serializable;

/**
 * Created by mafunes on 7/7/15.
 */
public class Item implements Serializable {
    public final String title;

    private Item(Builder builder) {
        this.title = builder.title;
    }

    public static class Builder {
        private String title;

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}
