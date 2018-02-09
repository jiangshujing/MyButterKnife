package com.jsj.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.BindView;
import com.jsj.butterknife.MyButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(value = R.id.tv_textview)
    TextView tv_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyButterKnife.bind(this);

        tv_textview.setText("哈哈");
    }
}
