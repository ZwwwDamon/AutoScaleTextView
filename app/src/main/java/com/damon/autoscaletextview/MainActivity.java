package com.damon.autoscaletextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int mIndex;
    private AutoScaleTextView mAutoScaleTextView;
    private String[] mTestData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAutoScaleTextView = findViewById(R.id.astv_main);
        Button btnChange = findViewById(R.id.btn_change);
        mTestData = new String[]{
                "天王盖地虎，小鸡炖蘑菇",
                "天王盖地虎",
                "等你下课",
                "生活",
                "你不是真正的快乐"
        };

        mIndex = 0;
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAutoScaleTextView.setText(mTestData[mIndex % mTestData.length]);
                mIndex++;
            }
        });
    }
}
