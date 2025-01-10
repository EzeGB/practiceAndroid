package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void disable (View v){
        findViewById(R.id.button21).setEnabled(false);
        ((Button)findViewById(R.id.button21)).setText("Disabled");

//        View newView = findViewById(R.id.button21);
//        newView.setEnabled(false);
//        Button button = (Button) newView;
//        ((Button) newView).setText("New Disabled");

//        v.setEnabled(false);
//        Button myButt = (Button) v;
//        myButt.setText("Salamanca");
//        Log.d("success", "disabled butttonn");

    }
    public void turnDisabled (View v){
        v.setEnabled(false);
    }
    public void enableDisabler(View v){
        findViewById(R.id.button21).setEnabled(true);
    }
    public void change16 (View v){
        ((Button)findViewById(R.id.button16)).setText("not16");
        ((Button)findViewById(R.id.button17)).setText("yes17");
    }
    public void change17 (View v){
        ((Button)findViewById(R.id.button16)).setText("yes16");
        ((Button)findViewById(R.id.button17)).setText("not17");
    }

    public void disMany (View v){
        findViewById(R.id.button19).setEnabled(false);
        ((Button)findViewById(R.id.button19)).setText("Disabled");
        findViewById(R.id.button20).setEnabled(false);
        ((Button)findViewById(R.id.button20)).setText("Disabled");
        findViewById(R.id.button25).setEnabled(false);
        ((Button)findViewById(R.id.button25)).setText("Disabled");
        findViewById(R.id.button26).setEnabled(false);
        ((Button)findViewById(R.id.button26)).setText("Disabled");
    }
}