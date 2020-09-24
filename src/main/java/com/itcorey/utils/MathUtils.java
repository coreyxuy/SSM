package com.itcorey.utils;


import org.springframework.util.Assert;

/**
 * @Auther: corey
 * @Date: 2020/9/24 09:29
 * @Description:数学计算器
 */
public class MathUtils {
    public static void main(String[] args) {
        String bb = "123456789";
        Assert.notNull(bb, "value must not be null");
        int length = bb.length();
        System.out.println("=="+length);
        greateUtils(bb);
    }

    public static void greateUtils(String key){
        String getenv = System.getenv(key);
        System.out.println(getenv);
    }
}
