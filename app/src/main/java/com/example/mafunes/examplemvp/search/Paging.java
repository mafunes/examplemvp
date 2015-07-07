package com.example.mafunes.examplemvp.search;

import java.io.Serializable;

/**
 * Created by mafunes on 7/7/15.
 */
public class Paging implements Serializable {
    public final Long total ;

    public Paging(Long total) {
        this.total = total;
    }
}


