package com.example.mafunes.examplemvp.search;

/**
 * Created by mafunes on 7/7/15.
 */
public class SearchPresenterImpl implements SearchPresenter, OnSearchFinishedListener {

    private SearchView searchView;
    private SearchModel searchModel;

    public SearchPresenterImpl(SearchView searchView) {
        this.searchView = searchView;
        this.searchModel = new SearchModelImpl();
    }

    @Override
    public void search(String queryString) {
        searchView.showProgress();
        searchModel.search(queryString, this);
    }

    @Override
    public void onSuccess(Search search) {
        searchView.navigateToSearchResult(search);
    }

    @Override
    public void onError() {
        searchView.hideProgress();
        searchView.setSearchError();
    }
}
