package com.example.mafunes.examplemvp.search;

/**
 * Created by mafunes on 7/7/15.
 */
public interface  SearchView {

    void showProgress();

    void hideProgress();

    void setSearchError();

    void navigateToSearchResult(Search search);
}
