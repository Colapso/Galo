package com.collaps.lokin;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class printRunningApps extends AppCompatActivity {

    String runningApps[] = {"facebook", "linkedin", "clashRoyale", "novaApp", "Definições", "Contactos","olaeadeus"};
    int highestIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_runnin_apps);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        for (int i = 0; i <runningApps.length ; i++)
        {
            LinearLayout row = new LinearLayout(this);
            row.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT));
            for (int j = 0; j < 3; j++,highestIndex++)
            {
                if (highestIndex < runningApps.length)
                {
                    Button first = new Button(this);
                    first.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
                    first.setText(runningApps[highestIndex]);
                    first.setId(highestIndex);
                    row.addView(first);
                }
            }
            linearLayout.addView(row);
        }
    }
}
