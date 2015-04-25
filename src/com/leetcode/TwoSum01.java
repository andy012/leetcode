package com.leetcode;


/**
 * Created by andydoo on 4/25/15.
 * email:duhongguang@foxmail.com
 */

import java.util.HashMap;

/**
 * problem url: https://leetcode.com/problems/two-sum/
 *
 * problem detail:
 *
 * Given an array of integers, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution.
->>>
 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
->>>
 Tags:Array,Hash Table;
 my Runtime: 317 ms
 */
public class TwoSum01 {

    public static void main(String[] args){
        return;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i < nums.length;++i){
            if(map.containsKey(target-nums[i])){
                index1= map.get(target-nums[i]);
                return new int[]{index1+1,i+1};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[2];
    }

}