package com.example.mafunes.examplemvp.search;

import java.io.Serializable;

/**
 * Created by mafunes on 7/7/15.
 */
public class Paging implements Serializable {
    public final Long total ;

    private Paging(Builder builder) {
        this.total = builder.total;
    }

    public static class Builder {
        private Long total;

        public Builder withTotal(long total) {
            this.total = total;
            return this;
        }

        public Paging build() {
            return new Paging(this);
        }
    }
}


