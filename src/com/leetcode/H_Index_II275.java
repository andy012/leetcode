package com.leetcode;

import java.util.Scanner;

/**
 * Created by andy on 9/11/16.
 */
public class H_Index_II275 {
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

        if(citations.length > 0 && citations[citations.length-1] == 0) return 0;
        for (int i = citations.length -1; i >=0; i--) {
            if(citations.length -i >= citations[i]) {
                return citations.length -i == citations[i] ? citations.length - i:citations.length - i-1;
            }
        }
        return citations.length;
    }
}
