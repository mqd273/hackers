package wang.lidong.base.type.test;

/**
 * @Author:lidongw_1
 * @Date 2021/1/15
 * @Description: TODO
 **/
public class IntegerTest {

    public static void main(String[] args) {
        Integer integer = new Integer(5555);

        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toHexString(555));
        System.out.println(Integer.toOctalString(0x7));
    }
}
