package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 全排列
 * Created by andy on 8/10/16.
 */
public class NextPermutations31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int[] array = new int[num];

            for (int i = 0; i < num; i++) {
                array[i]=scanner.nextInt();
            }

            nextPermutation(array);
            System.out.println(Arrays.toString(array));



        }
    }


    public static void nextPermutation(int[] nums) {

        int reverseStart=findReverseStart(nums);
        if(reverseStart==-1){
            Arrays.sort(nums);
        }
        else {

            int minBigerThanReverseStartPos= findMinBigerThanReverseStart(nums,reverseStart);
            swapArray(nums,reverseStart,minBigerThanReverseStartPos);

            Arrays.sort(nums,reverseStart+1,nums.length);

        }





    }

    public static void swapArray(int [] nums,int pos1,int pos2){
        int tmp=nums[pos1];
        nums[pos1]=nums[pos2];
        nums[pos2]=tmp;
    }
    public static int findReverseStart(int[] nums){
        for(int i=nums.length-1;i>0;--i){
            if(nums[i] > nums[i-1]){
                return i-1;
            }
        }
        return -1;
    }

    public static int findMinBigerThanReverseStart(int[] nums,int reverseStartPos){

        int minBigerThanReverseStartPos=reverseStartPos;
        int minBigerThanReverseStartValue=Integer.MAX_VALUE;

        for(int i=reverseStartPos+1;i<nums.length;++i){
            if(nums[i] > nums[reverseStartPos] && minBigerThanReverseStartValue > nums[i] ){
                minBigerThanReverseStartPos=i;
                minBigerThanReverseStartValue=nums[i];
            }
        }

        return minBigerThanReverseStartPos;
    }

}
