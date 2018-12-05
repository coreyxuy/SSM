package com.itcorey.utils;

import org.joda.time.DateTime;

import java.util.Date;
import java.util.Locale;

/**
 * @author corey
 * @date 2018/12/5 23:08
 */
public class TimeUtils {

    private static void test02() {

        //初始化一个DateTime对象
        DateTime dateTime1 = new DateTime();

//        Date date = new Date();
//        date.setTime("");

        DateTime dateTime2 = new DateTime(2018, 12, 4, 0, 0, 0);
        DateTime.Property property = dateTime2.centuryOfEra();


        //时间戳 * 1000,时间戳,DateTime相互转换,返回的是13位的,传也是,注意
        DateTime dateTime3 = new DateTime(1456473917004L);
        long millis = dateTime3.getMillis();


        //DateTime对象和Date对象相互转换
        DateTime dateTime4 = new DateTime(new Date());
        Date date = dateTime4.toDate();

        DateTime dateTime5 = new DateTime("2018-12-04T00:00:00.000+08:00");

        //这个方法很好用,可以传不同格式的,跟着心走
        System.out.println(dateTime5.toString("yyyy-MM-dd HH:mm:ss"));
    }


    private static void test03() {

        DateTime dateTime2000Year = new DateTime(2000, 2, 29, 0, 0, 0);
        System.out.println(dateTime2000Year); // out: 2000-02-29T00:00:00.000+08:00
        DateTime dateTime1997Year =
                dateTime2000Year.withYear(1997);
        //没有set,get方法,每一次修改都是新的对象
        System.out.println(dateTime1997Year); // out: 1997-02-28T00:00:00.000+08:00

        //增加减少都是可以传负数的哦!!!
        DateTime now = new DateTime();
        System.out.println(now); // out: 2016-02-26T16:27:58.818+08:00
        DateTime tomorrow = now.plusDays(1);
        DateTime yesterday = now.plusDays(-1);

        System.out.println(tomorrow); // out: 2016-02-27T16:27:58.818+08:00
        DateTime lastMonth = now.minusMonths(1);
        DateTime nextMonth = now.minusMonths(-1);

        System.out.println(lastMonth); // out: 2016-01-26T16:27:58.818+08:00


        DateTime now2 = new DateTime(); // 2016-02-26T16:51:28.749+08:00
        now2.monthOfYear().getAsText(); // February
        now2.monthOfYear().getAsText(Locale.KOREAN); // 2월
        now2.dayOfWeek().getAsShortText(); // Fri
        now2.dayOfWeek().getAsShortText(Locale.CHINESE); // 星期五

    }


}
