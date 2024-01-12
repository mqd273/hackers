package wang.lidong.util;

import java.util.Base64;

/**
 * @Author:lidongw_1
 * @Date 2021/4/12
 * @Description: TODO
 **/
@SuppressWarnings("ALL")
public class Java_Util_Objects {


  /*  public static void main(String[] args) {
        String d = "\\u0026OrderID\\u003d14495013259\\u0026OrderSource\\u003d1\\u0026OrgAni\\u003d18801796629\\u0026OrgDnis\\u003d051368192128\\u0026_ul\\u003d1\\u0026channel\\u003dHTL\\u0026op\\u003d110016\\u0026opvdn\\u003d411009\\u0026sessionId\\u003d100000000083828";
        String flowIdJosn =  new String(Base64.getDecoder().decode(d));
        System.out.println(flowIdJosn);
    }*/


   public static void main(String[] args) {


       Long l = 0L;

       boolean equals = l.equals(null);

       System.out.println(equals);

       long l1 = Long.parseLong("");

       //JSONUtils.fromString()

       String d = "\\u0026OrderID\\u003d14495013259\\u0026OrderSource\\u003d1\\u0026OrgAni\\u003d18801796629\\u0026OrgDnis\\u003d051368192128\\u0026_ul\\u003d1\\u0026channel\\u003dHTL\\u0026op\\u003d110016\\u0026opvdn\\u003d411009\\u0026sessionId\\u003d100000000083828";

       String flowIdJosn =  new String(Base64.getDecoder().decode(d));

       System.out.println(flowIdJosn);

        java.util.Objects.equals(new Object(),new Object());
        System.out.println(java.util.Objects.equals(null,new Object()));

       // IntegerCache.cache
    }
 /*

    public void init(){

       // super.in
    }*/

}
