package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 全排列
 * Created by andy on 8/10/16.
 */
public class Permutations46 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int[] array = new int[num];

            for (int i = 0; i < num; i++) {
                array[i]=scanner.nextInt();
            }


            List<List<Integer>> permutations=new ArrayList<List<Integer>>();


            permute(array,permutations);


            for(List<Integer> list:permutations){
                System.out.println(Arrays.toString(list.toArray()));
            }



        }
    }


    public static void permute(int[] nums,List<List<Integer>> permutations) {
        boolean[] posArray=new boolean[nums.length];
        int[] permute=new int[nums.length];

        recursion(nums,0,permute,posArray,permutations);

        return ;
    }


    public static void recursion(int[] nums,int pos,int[] permute,boolean[] posArray,List<List<Integer>> permutations){


        if(pos == nums.length){
            List<Integer> permuteList=new ArrayList<Integer>();
            for(int ele:permute){
                permuteList.add(ele);
            }
            permutations.add(permuteList);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(!posArray[i]){
                posArray[i]=true;
                permute[pos]=nums[i];
                recursion(nums,pos+1,permute,posArray,permutations);
                posArray[i]=false;
            }
        }



    }







}
