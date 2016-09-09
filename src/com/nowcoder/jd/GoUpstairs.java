package com.nowcoder.jd;

import java.util.Scanner;

/**
 * Created by andy on 9/5/16.
 */
public class GoUpstairs {
    static long [] a = new long[101];
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while (scanner.hasNext()){
            int m = scanner.nextInt();
            System.out.println(findMethods(m-1));

        }
    }

    public static long findMethods(int m){

        if(m == 0) return 1;
        if( m < 0) return 0;

        if(a[m] !=0 ) return a[m];

        if(m >= 1) {
            a[m - 1] = findMethods(m - 1);
        }
        if(m >=2) a[m-2] = findMethods(m-2);
        long sum = findMethods(m-1)+findMethods(m-2);
        if(sum > 1000000007){
            sum %=1000000007;
        }
        return sum;
    }
}
