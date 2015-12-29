package com.home.ilemus.fnot;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by 3890042 on 12/29/2015.
 */
public class ResultActivity extends MainActivity {
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        EditText text = (EditText)findViewById(R.id.inputForIntent);
        String value = text.getText().toString();

    }
}
