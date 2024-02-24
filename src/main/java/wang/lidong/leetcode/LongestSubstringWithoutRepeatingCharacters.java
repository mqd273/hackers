package wang.lidong.leetcode;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:lidongw_1
 * @Date 2020/5/29
 * @Description: 无重复字符的最长子串
 **/
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        // String s = "abcdefdg";
        // String s ="abcabcbb"; //abc
        // String s = "bbbbb"; //b
        // String s = "pwwkew";
        //  String s = "pwwwwkew";
       //  String s = "pwwewkew";
        // String s = "abba";
        //  String s ="aab";
         // String s ="tmmzuxt";

       // lengthOfLongestSubstring(s);

        ArrayList<String> strings = Lists.newArrayList("abcdefdg",
                "abcabcbb", "bbbbb", "pwwkew", "pwwwwkew", "pwwewkew", "abba",
                "aab","tmmzuxt","abcdefghik");

        for (String string : strings) {
            lengthOfLongestSubstring(string);
        }

    }

    private static void lengthOfLongestSubstring(String s) {
        int ptr = 0;
        int start = 0;
        int maxStart = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (ptr < s.length()) {
            char c = s.charAt(ptr);
            /** 如果包含了，就需要停止了*/
            if (map.containsKey(c)) {
                if ((ptr - start) > maxLen) {
                    maxStart = start;
                    maxLen = ptr - start;
                }
                start = map.get(c) >= start ? map.get(c) + 1 : start;
            }
            map.put(c, ptr);
            ++ptr;
        }

        if ((ptr - start) > maxLen) {
            maxStart = start;
            maxLen = ptr - start;
        }

       /* if (maxLen == 0) {
            maxLen = s.length();
        }*/

        System.out.println("长度：" + maxLen + " 字符：" + s.substring(maxStart, maxStart + maxLen) +" s:"+maxStart + " e:"+ (maxStart+maxLen));
    }
}
