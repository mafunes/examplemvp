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
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                if (TextUtils.isEmpty(queryString)){
                    onSearchFinishedListener.onError();
                } else {
                    final Item item1 = new Item("nexus 5");
                    final Item item2 = new Item("nexus 4");
                    Search search = new Search(queryString, null, new ArrayList<Item>() {{
                        add(item1);
                        add(item2);
                    }});
                    onSearchFinishedListener.onSuccess(search);
                }
            }
        }, 2000);
    }
}
