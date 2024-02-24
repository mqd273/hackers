package wang.lidong.leetcode;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author:lidongw_1
 * @Date 2020/5/28
 * @Description: 解码字符串
 **/
public class DecodeString {

    public static void main(String[] args) {

      //  char[] types = java.lang.String.valueOf(2).toCharArray();
      //  System.out.println(StringUtils.join(types));

        //  String str ="3[a]2[bc]"; 返回 "aaabcbc".
        // String str = "3[a2[c]]"; //accaccacc accaccacc
        //  String str = "2[abc]3[cd]ef"; //返回 "abcabccdcdcdef".
        // String str = "100[leetcode]";
        // String str = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
      //  System.out.println(decodeString(str));

        HashMap hm = new HashMap<Integer, String>(8,1f);
       /* for (int i = 0; i < 18; i++) {
            hm.put(i,"1");
        }*/

        hm.put(1,1);
        hm.put(2,2);
        hm.put(3,3);
        hm.put(9,9);



        System.out.println("");
    }

    static String decodeString(String str) {

        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int n = 0; n < chars.length; n++) {
            /**如果是数字就重复*/
            do {
                String num = "";
                while (48 <= chars[n] && chars[n] <= 57) {
                    num += chars[n];
                    n++;
                }

                if (!Strings.isNullOrEmpty(num)) {
                    n = dupString(Integer.valueOf(num), n += 1, chars, sb);
                }
                n = n >= chars.length ? --n : n;
            } while (48 <= chars[n] && chars[n] <= 57);

            if (chars[n] != 93) sb.append(chars[n]);
        }
        return sb.toString();
    }

    /**
     * 返回结果指向下一个
     * @param dupNum
     * @param start
     * @param chars
     * @param sb
     * @return
     */
    static int dupString(int dupNum, int start, char[] chars, StringBuilder sb) {
        int end = start;
        for (int i = 0; i < dupNum; i++) {
            int slide = start;
            while (chars[slide] != 93) {
                while (48 <= chars[slide] && chars[slide] <= 57) {
                    String num = "";
                    while (48 <= chars[slide] && chars[slide] <= 57) {
                        num += chars[slide];
                        slide++;
                    }
                    if (!num.equals("")) {
                        slide = dupString(Integer.valueOf(num), slide += 1, chars, sb);
                    }

                  //  slide++;
                    slide = slide >= chars.length ? --slide : slide;
                    if (!(48 <= chars[slide] && chars[slide] <= 57)) {
                        slide--;
                    }
                }

                if (chars[slide] != 93){
                    sb.append(chars[slide]);
                }
                if ((slide + 1) < chars.length) {
                    slide++;
                }
            }

            if (chars[slide] == 93) {
                end = slide+1;
            }
        }
        return end;
    }

}
