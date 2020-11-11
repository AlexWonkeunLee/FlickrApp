package com.example.youtubeapp.flickrbrowser;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;

public class SearchActivity extends BaseActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        activateToolbar(true);
    }
}