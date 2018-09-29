package com.singh.hans;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ICS115", "onStart() has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ICS115", "onResume() has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ICS115", "onPause() executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ICS115", "onDestroy() executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ICS115", "onDestroy() has executed...");
    }

    public void showToast(View v) {
        Toast.makeText( this, "Going back...",
        Toast.LENGTH_SHORT).show();
    }

    public void showSnackbar(View vv) {
        Snackbar.make(vv, "Going next...",
                Snackbar.LENGTH_SHORT).show();
    }

}
