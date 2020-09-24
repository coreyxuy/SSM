package com.itcorey.test;

/**
 * @Auther: corey
 * @Date: 2020/9/24 10:38
 * @Description:
 */
public class TestCode {
    public static void main(String[] args) {
        TestCode testCode = new TestCode();
    }

    //构造函数
    public TestCode(){
        System.out.println("TestCode的构造函数");
    }

    //构造代码块
    {
        System.out.println("TestCode的构造代码块");
    }

    //静态代码块
    static {
        System.out.println("TestCode的静态代码块");
    }


}
