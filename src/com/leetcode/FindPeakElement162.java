package com.leetcode;

import java.util.Scanner;

/**
 * Created by andy on 9/11/16.
 */
public class FindPeakElement162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] citations = new int[n];

            for(int i=0;i<n;++i){
                citations[i] = scanner.nextInt();
            }
            System.out.println(findPeakElement(citations));
        }
    }

    public static int findPeakElement(int[] nums) {

        if(nums.length ==0 ) return -1;
        if(nums.length == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[nums.length -1] > nums[nums.length -2]) return nums.length -1;
        for(int i=1;i<=nums.length -2 ;++i){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) return i;
        }
        return -1;
    }
}
