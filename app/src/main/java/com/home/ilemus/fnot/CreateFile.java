package com.home.ilemus.fnot;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by 3890042 on 12/28/2015.
 */
public class CreateFile extends MainActivity{
    static FileOutputStream output;
    CreateFile (View view) {
        Snackbar.make(view, "File Created", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
        //An inserted action
        JSONObject json = new JSONObject();
        try {
            json.put("Attempt", 0);
            json.put("Weather condition", "Ice Shower");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String filename = "file.txt";
        String toFile = json.toString();
        //The try statement required to use file streams
        try {
            output = openFileOutput(filename, Context.MODE_PRIVATE);
            output.write(toFile.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
