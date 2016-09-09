package com.leetcode;

import java.util.Scanner;

/**
 * Created by andy on 8/13/16.
 */
public class ZigZagConversion6 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            System.out.println(convert(str,3));
        }

    }
    public static String convert(String s, int numRows) {

        char[] chars=s.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();





        return stringBuilder.toString();

    }

}
