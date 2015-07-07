package com.example.mafunes.examplemvp.search;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.mafunes.examplemvp.R;
import com.example.mafunes.examplemvp.searchresult.SearchResultActivity;


public class SearchActivity extends AppCompatActivity implements View.OnClickListener, SearchView {

    private ProgressBar progressBar;
    private EditText queryString;
    private SearchPresenter searchPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progress);
        queryString = (EditText) findViewById(R.id.edit_query);
        searchPresenter = new SearchPresenterImpl(this);
        findViewById(R.id.search_button).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        searchPresenter.search(queryString.getText().toString());
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setSearchError() {
        queryString.setError(getString(R.string.query_string_error));
    }

    @Override
    public void navigateToSearchResult(Search search) {
        startActivity(new Intent(getApplicationContext(), SearchResultActivity.class).putExtra(SearchResultActivity.RESULTS, search.results));
    }
}
