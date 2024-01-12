package com.tujia.cipherTest;


import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @Author:lidongw_1
 * @Date 2020/3/9
 * @Description: TODO
 **/
public class AESTest {

    private static final char[] bcdLookup = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

    private static final String key = "abcaaaaaaaaaaaaa";
    public static void main(String[] args) throws Exception {

        int sourceNum = 3901;
        String encode = encode(sourceNum + "", key);

        System.out.println(encode);


        //2e4c38cf396111919bda2192b86b9926
        //807550f274dd4786afb3c6a26488ddfe


        String decode = decode("522b852ae8d14deea7a02b681ce8827b", key);

        System.out.println(decode);


     /*   if (decode.contains("$$")){
            int i = Numbers.toInt(decode.substring(decode.indexOf("$$"))+2, 0);
            System.out.println(i);
        }*/

        String[] $$s = "30784494$$0".split("$$");

        System.out.println($$s[0] + "_" + $$s[1]);
    }



    /**
     * 解密
     *
     * @param content   密文
     * @param key 加密密码
     * @return String
     * @throws Exception 异常
     */
    public static String decode(String content, String key) throws Exception {
        byte[] arr = string2ByteArr(content);
        byte[] raw = key.getBytes("utf-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] original = cipher.doFinal(arr);
        return new String(original,"utf-8");
    }

    /**
     * 加密
     *
     * @param content      原文
     * @param key 加密密码
     * @return String
     * @throws Exception 异常
     */
    public static String encode(String content, String key) throws Exception {
        byte[] raw = key.getBytes("utf-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//"算法/模式/补码方式"
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(content.getBytes("utf-8"));
        return byteArrToString(encrypted);
    }

    /**
     * 将字节数组转换为16进制字符串
     * @param bcd 字节数组
     * @return String
     */
    public static String byteArrToString(byte[] bcd) {
        StringBuffer s = new StringBuffer(bcd.length * 2);
        for (int i = 0; i < bcd.length; i++) {
            s.append(bcdLookup[(bcd[i] >>> 4) & 0x0f]);
            s.append(bcdLookup[bcd[i] & 0x0f]);
        }
        return s.toString();
    }

    /**
     * 将16进制字符串转换为字节数组
     * @param str 16进制字符串
     * @return byte[]
     */
    public static byte[] string2ByteArr(String str) {
        byte[] bytes;
        bytes = new byte[str.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer.parseInt(str.substring(2 * i, 2 * i + 2),16);
        }
        return bytes;
    }

   /* public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;

            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }*/
    // f096386a73f863fdd1f9c4e3acdf78d1
}
