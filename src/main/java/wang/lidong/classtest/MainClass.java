package wang.lidong.classtest;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author:lidongw_1
 * @Date 2021/8/11
 * @Description: TODO
 **/
public class MainClass {

    public static void main(String[] args) {


        LocalDateTime localDateTime = LocalDateTime.now().plusDays(-90);

        String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println(format);
        //LocalDateTime.parse(format)


        Timestamp timestamp1 = Timestamp.valueOf(LocalDateTime.parse(format));

        LocalDateTime parse = LocalDateTime.parse(format);




        System.out.println(timestamp1.toString());


        ClassA a =new ClassA();
        ClassA.B b = new ClassA.B();
        Boolean aBoolean = Boolean.valueOf("0");
        boolean b1 = true;
        Integer it = b1 ? 0 : null;
        if (it == null || it.equals(0)){
            System.out.println( "it is empty");
        }

    }
}
