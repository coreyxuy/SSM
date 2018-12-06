package com.itcorey.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ：Corey
 * 11:05 2018/12/6
 * 五中遍历列表的方式
 */
public class ListTraverse {

    public static void main(String[] args) {
//        method1();
        method2();

    }



    /**
     * 方法引出遍历
     */
    public static void method1() {
        List list = new ArrayList();
        list.add("饶东东");
        list.add("张三");
        list.add("李斯");
        System.out.println("---> method5 output:");
        list.forEach(System.out::println);

    }

    /**
     * 实用lambda表达式
     */
    public static void method2() {
        List list = new ArrayList();
        list.add("饶东东");
        list.add("张三");
        list.add("李斯");
        System.out.println("---method4 output");
        list.forEach(e -> System.out.println(e));
    }


    /**
     * 使用迭代器遍历
     */
    public static void method(){
        List list = new ArrayList();
        list.add("饶东东");
        list.add("张三");
        list.add("李斯");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("");
        }
    }





}
