package wang.lidong.timeTest;

import org.joda.time.DateTime;

import java.text.DateFormat;

/**
 * @Author:lidongw_1
 * @Date 2022/4/11
 * @Description: TODO
 **/
public class TimeDemo1 {

    public static void main(String[] args) {
        DateTime now = DateTime.now();
        System.out.println(now.toDate());
    }
}
