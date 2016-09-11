package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by andy on 9/11/16.
 */
public class TwoSumII167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] numbers = new int[n];

            for(int i=0;i<n;++i){
                numbers[i] = scanner.nextInt();
            }
            int target = scanner.nextInt();
            System.out.println(Arrays.toString(twoSum(numbers,target)));
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        if(numbers==null || numbers.length < 1) return null;
        int i=0, j=numbers.length-1;

        while(i<j) {
            int x = numbers[i] + numbers[j];
            if(x<target) {
                ++i;
            } else if(x>target) {
                --j;
            } else {
                return new int[]{i+1, j+1};
            }
        }
        return null;
    }
}
