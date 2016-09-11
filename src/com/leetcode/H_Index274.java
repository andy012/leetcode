package com.leetcode;

import java.util.Scanner;

/**
 * 使用额外的空间。
 * counting sort 的变种.
 * Created by andy on 9/11/16.
 */
public class H_Index274 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] citations = new int[n];

            for(int i=0;i<n;++i){
                citations[i] = scanner.nextInt();
            }
            System.out.println(hIndex(citations));
        }
    }

    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] countArray = new int[n+1];

        for(int i=0;i<n;++i){
            if(citations[i] > n) countArray[n]++;
            else countArray[citations[i]] ++;
        }

        if(countArray[n] >= n) return n;

        for(int i=n-1;i >=0;--i){
            countArray[i] += countArray[i+1];
            if(countArray[i] >= i) return i;
        }

        return 0;

    }
}
