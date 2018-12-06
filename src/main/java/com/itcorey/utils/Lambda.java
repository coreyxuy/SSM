package com.itcorey.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ：Corey
 * 10:16 2018/12/6
 * Lambda 遍历
 */
public class Lambda {

    public static void main(String[] args) {
        //遍历list
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add("java");
        }
        //获取开始时间
        long startTime = System.currentTimeMillis();
        list.stream().forEach(String ->{
            System.out.println("========>"+String);
        });
        //结束时间
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("代码执行时间为"+(endTime-startTime)+"ms");

    }
}
