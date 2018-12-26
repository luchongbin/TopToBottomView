package com.luchongbin.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.luchongbin.toptobottomlayout.TopToBottomLayout;
/**
 * Created by luchongbin on 2018/6/27/027.
 */
public class MainActivity extends AppCompatActivity {
    private TopToBottomLayout toolbarPanelLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbarPanelLayout =  findViewById(
                R.id.sliding_down_toolbar_layout);
        TextView openButton =  findViewById(R.id.open_button);
        TextView closeButton = findViewById(R.id.close_button);

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toolbarPanelLayout.openPanel();
            }
        });

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toolbarPanelLayout.closePanel();
            }
        });
    }
}
