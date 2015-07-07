package com.example.mafunes.examplemvp.search;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mafunes on 7/7/15.
 */
public class Search implements Serializable {

    public final String query;
    public final Paging paging;
    public final List<Item> results;

    private Search(Builder builder) {
        this.query = builder.query;
        this.paging = builder.paging;
        this.results = builder.results;
    }

    public static class Builder {
        private String query;
        private Paging paging;
        private List<Item> results;

        public Builder withQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder withPaging(Paging paging) {
            this.paging = paging;
            return this;
        }

        public Builder withResults(List<Item> results) {
            this.results = results;
            return this;
        }

        public Search build() {
            return new Search(this);
        }
    }
}