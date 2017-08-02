package kr.co.tjeit.beautisalon.utills;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by the on 2017-07-27.
 */

public class DateTimeUtill  {

    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    // 2017년 10월 25일
    static  SimpleDateFormat timeFormat = new SimpleDateFormat("a hh:mm");

    // 날짜와 시간을 돌려주는 메쏘드
    // 2017-10-08 오전 8시 10분
    static  SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd H:mm");

    // 날짜포멧변수

    // 날짜와 시간을 돌려주는 메쏘드 / 날짜포멧변수
    // 2017-09-08 오전 8:10
    // 완성하면, 직원로그인 해서 나타나는 화면에 날짜시간을 모두 찍어주자

    // 메쏘드

    public static String getDateTimeString(Calendar dateTimeCal){
        String str = dateTimeFormat.format(dateTimeCal.getTime());
        return str;
    }


    public static String getDateString(Calendar dateCal){
        String str = dateFormat.format(dateCal.getTime());
        return str;
    }

    public static String getTimeString(Calendar timecal){
        String str = timeFormat.format(timecal.getTime());
        return str;
    }

}
