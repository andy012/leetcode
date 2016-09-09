package com.leetcode;

import java.util.Scanner;

/**
 * Created by andy on 8/13/16.
 */
public class LengthOfLastWord58 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            System.out.println(lengthOfLastWord(str));
        }

    }
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        if(s.contains(" ")) {
            return s.substring(s.lastIndexOf(" ")+1,s.length()).length();
        }else {
            return s.length();
        }
    }
}
