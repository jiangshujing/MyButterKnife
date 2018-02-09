package com.jsj.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jsj.demo.fruit.FruitColor;
import com.jsj.demo.fruit.FruitInfoUtil;
import com.jsj.demo.fruit.FruitName;
import com.jsj.demo.fruit.FruitProvider;

/**
 * Created by jiangshujing on 2018/2/9.
 * 使用自定义注解
 */

public class TestAnnotationActivity extends AppCompatActivity {

    @FruitName("Apple")
    private String appleName;
    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appColor;
    @FruitProvider(id = 1, name = "红富士集团", address = "红富士大厦")
    private String appProvider;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FruitInfoUtil.getFruitInfo(TestAnnotationActivity.class);
    }
}
