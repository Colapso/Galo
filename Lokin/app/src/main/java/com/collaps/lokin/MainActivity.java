package com.collaps.lokin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewGroup linearLayout = (ViewGroup)findViewById(R.id.activity_main);

        Button first = new Button(this);
        first.setText("View Running Apps");
        first.setOnClickListener(this);
        first.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT,ActionBar.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(first);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,printRunningApps.class);
        startActivity(intent);
    }
}
