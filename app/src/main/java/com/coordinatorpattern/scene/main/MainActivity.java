package com.coordinatorpattern.scene.main;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.coordinatorpattern.R;

public class MainActivity extends AppCompatActivity {

    Context mainActivityContext;
    public MainActivityDelegate delegate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Main","Main");

        this.mainActivityContext = this;
        Button btn = findViewById(R.id.main_test_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","Button Tapped");
                delegate.homeButtonTapped(mainActivityContext);
            }
        });
    }
}
