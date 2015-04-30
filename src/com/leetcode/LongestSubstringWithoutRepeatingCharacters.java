package com.leetcode;

/**
 * Created by havstack on 4/30/15.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println( "abc".indexOf('b',1));
        System.out.println(lengthOfLongestSubstring("abcabcbbcde"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();

        int max_len=1;
        int start_index=0;
        for(int i=0;i<s.length();++i){
            int index=s.indexOf(s.charAt(i),start_index);
            //System.out.println("index = [" + index + "]"+i+","+s.charAt(i));
            if(index < i){
                if(i-start_index > max_len) max_len = i - start_index;
                start_index=index + 1;
                //System.out.println("start_index = [" + start_index + "]");
            }else{
                if(i== s.length()-1 && i-start_index >= max_len)
                    max_len = i - start_index +1;
            }

        }
        return max_len;
    }
}
