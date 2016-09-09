package com.others.javabase;

import java.util.Scanner;

/**
 * Created by andy on 8/28/16.
 */
public class SherlockParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            int l=scanner.nextInt();
            int r=scanner.nextInt();
            int total = l > r ? getTotalNumber(r): getTotalNumber(l);
            System.out.println("Case #"+i+": "+total);
        }

    }

    public static int getTotalNumber(int m){
        int sum =0;
        for(int i=1;i<=m;++i){
            sum+=i;
        }
        return sum;
    }

}
