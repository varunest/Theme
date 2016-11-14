package com.anmolmalhotra.theme;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    String prefs = "THEME";
    int theme;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        sharedPreferences = getSharedPreferences(prefs, Context.MODE_PRIVATE);
        theme = sharedPreferences.getInt("THEME1", 0);

        if (theme == 0) {
            setTheme(R.style.AppTheme);
        }
        else {
            setTheme(theme);
        }

        super.onCreate(savedInstanceState);

    }
}
