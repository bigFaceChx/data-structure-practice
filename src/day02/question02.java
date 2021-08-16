package day02;

import java.util.HashSet;

/**
 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。

 输入: s = "abcabcbb"
 输出: 3
 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

 输入: s = "abcabcbb"
 输出: 3
 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 **/
public class question02 {
    public static void main(String[] args) {
        String s="abcabcbb";
        int size=solution(s);
    }

    private static int solution(String s) {
        int maxSize=0;
        int current=1;
        HashSet<Character> maxstr = new HashSet<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]!=chars[i+1]){
                current++;
                maxstr.add(chars[i]);
            }

        }
        return 0;
    }
}
