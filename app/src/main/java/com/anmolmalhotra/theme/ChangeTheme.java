package com.anmolmalhotra.theme;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class ChangeTheme extends BaseActivity {

    ImageView iv1,iv2;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    String prefs = "THEME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_theme);

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);

        sharedPreferences = getSharedPreferences(prefs, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putInt("THEME1", R.style.Theme1);
                editor.commit();
                Intent i = new Intent(ChangeTheme.this, ChangeTheme.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                finish();
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putInt("THEME1", R.style.Theme2);
                editor.commit();
                Intent i = new Intent(ChangeTheme.this, ChangeTheme.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                finish();
            }
        });

    }

}
