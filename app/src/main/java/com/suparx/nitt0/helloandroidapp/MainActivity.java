package com.suparx.nitt0.helloandroidapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.suparx.nitt0.helloandroidapp.R.string.greetingHelloWorld;

/**
 * Created by nitt0 on 2018-02-24(Sat) UU-Base
 */

public class MainActivity extends AppCompatActivity {

    private TextView mainTextView;
    private Button mainButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setListener();

    }

    private void initView() {
        mainButton = (Button) findViewById(R.id.button);
        mainTextView = (TextView) findViewById(R.id.tv_main);
    }

    private void setListener() {
        mainButton.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mainTextView.setText(greetingHelloWorld);
                }
            }
        );
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
