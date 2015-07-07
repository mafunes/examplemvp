package com.example.mafunes.examplemvp.search;

import android.os.Handler;
import android.text.TextUtils;

import java.util.ArrayList;

/**
 * Created by mafunes on 7/7/15.
 */
public class SearchModelImpl implements SearchModel {

    @Override
    public void search(final String queryString, final OnSearchFinishedListener onSearchFinishedListener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                if (TextUtils.isEmpty(queryString)){
                    onSearchFinishedListener.onError();
                } else {
                    Search.Builder builder = new Search.Builder();
                    builder
                            .withQuery(queryString)
                            .withPaging(new Paging.Builder().withTotal(0).build())
                            .withResults(new ArrayList<Item>() {{
                                add(new Item.Builder().withTitle("nexus 5").build());
                                add(new Item.Builder().withTitle("nexus 4").build());
                            }});
                    onSearchFinishedListener.onSuccess(builder.build());
                }
            }
        }, 2000);
    }
}
