package com.jsj.demo.fruit;

import android.util.Log;

import java.lang.reflect.Field;

/**
 * Created by jiangshujing on 2018/2/9.
 */

public class FruitInfoUtil {

    //通过反射获取注解信息
    public static void getFruitInfo(Class<?> clazz) {
        String strFruitName = "水果名称";
        String strFruitColor = "水果颜色";
        String strFruitProvicer = "供应商信息";


        Field[] fields = clazz.getDeclaredFields();//获取所有自己声明的字段
        for (Field field : fields) {//遍历所有字段
            //查找使用水果名称的字段
            if (field.isAnnotationPresent(FruitName.class)) {//是否指定类型的注释存在于此元素上
                FruitName fruitName = field.getAnnotation(FruitName.class);//存在就获取注解的值
                strFruitName = strFruitName + fruitName.value();
                Log.d("FruitInfoUtil", strFruitName);
            } else if (field.isAnnotationPresent(FruitColor.class)) {//查找使用水果颜色注解的字段
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor + fruitColor.toString();
                Log.d("FruitInfoUtil", strFruitColor);
            } else if (field.isAnnotationPresent(FruitProvider.class)) {//查找使用水果供应商注解的字段
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvicer = strFruitProvicer + fruitProvider.toString();
                Log.d("FruitInfoUtil", strFruitProvicer);
            }
        }
    }
}
