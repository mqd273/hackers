package com.tujia.format;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @Author:lidongw_1
 * @Date 2020/4/1
 * @Description: TODO
 **/
public class DecimalFormat {

    public static void main(String[] args) {

        String s = "9999992323.888";

        NumberFormat nf = new java.text.DecimalFormat(",###.##");
        System.out.println(nf.format(new BigDecimal(s)));

        NumberFormat numberFormatDutch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String c = numberFormatDutch.format(new BigDecimal(s.toString()));
        System.out.println("Currency Format: "+ c);
        try {
            Number  d = numberFormatDutch.parse(c);
            BigDecimal bd = new BigDecimal(d.toString());
            System.out.println(bd);
        } catch (
                ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
