package com.hadimusthafa.serializable;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Test test = (Test) getIntent().getSerializableExtra("test");

        Snackbar.make(getWindow().getDecorView().getRootView(),  test.name, Snackbar.LENGTH_SHORT).show();
    }
}