package com.example.mafunes.examplemvp.search;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by mafunes on 7/7/15.
 */
public class Search implements Serializable {

    public final String query;
    public final Paging paging;
    public final ArrayList<Item> results;

    public Search(String query, Paging paging, ArrayList<Item> results) {
        this.query = query;
        this.paging = paging;
        this.results = results;
    }
}