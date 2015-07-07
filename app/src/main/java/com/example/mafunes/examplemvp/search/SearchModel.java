package com.example.mafunes.examplemvp.search;

/**
 * Created by mafunes on 7/7/15.
 */
public interface SearchModel {

    void search(String queryString, OnSearchFinishedListener onSearchFinishedListener);

}
