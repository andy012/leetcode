package com.leetcode;

import java.util.Scanner;

/**
 * Created by andy on 9/4/16.
 */
public class ShortestPalindrome214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str= scanner.nextLine();
            System.out.println(shortestPalindrome(str));
        }
    }

    public static String shortestPalindrome(String str){

        if(str == null || str.length() ==0 || str.length() == 1) return str;
        StringBuilder stringBuilder = new StringBuilder(str);
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            if(isPalindrome(i+1,str)){
                maxLength = i+1;
            }
        }
        for(int j=maxLength;j<str.length();j++){
            stringBuilder.insert(0,str.charAt(j));
        }
        return stringBuilder.toString();

    }

    public static boolean isPalindrome(int length,String str){



        for(int i = 0;i< length/2;++i){
//            if( mid -i < 0 || mid+1 >= str.length() || str.charAt(mid-i) != str.charAt(mid+i)){
//                return false;
//            }
            if(str.charAt(i) != str.charAt(length - 1 -i)){
                return false;
            }

        }
        return true;

    }
}
