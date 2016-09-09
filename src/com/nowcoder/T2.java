package com.nowcoder;

import org.omg.PortableInterceptor.Interceptor;
import org.omg.PortableServer.ID_UNIQUENESS_POLICY_ID;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by andy on 9/5/16.
 */
public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        while (scanner.hasNext()){

            map.clear();
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[] prices = new int[n];

            for(int i=0;i<n;++i){
                prices[i] = scanner.nextInt();
            }

            scanner.nextLine();
            for(int i =0;i<m;++i){
                String str= scanner.nextLine().trim();
                if(map.containsKey(str)){
                    map.put(str,map.get(str)+1);
                }else {
                    map.put(str,1);
                }
               // map.putIfAbsent(str,map.getOrDefault(str,1));
            }



            System.out.println(Arrays.toString(map.keySet().toArray()));
            Integer[] nums= new Integer[map.size()];
            map.values().toArray(nums);
            Arrays.sort(nums);

            Arrays.sort(prices);
            //System.out.println(Arrays.toString(nums));
            //System.out.println(Arrays.toString(prices));
            System.out.println(getMin(prices,nums)+" "+getMax(prices,nums));



        }

    }

    public static int getMax(int[] prices,Integer[] nums){

        int sum=0;

        for(int i = nums.length -1; i >= 0;i--){
            sum += nums[i]*prices[prices.length - (nums.length -i)];
        }


        return sum;

    }
    public static int getMin(int[] prices,Integer[] nums){

        int sum=0;

        for(int i = nums.length -1; i >= 0;i--){
            sum += nums[i]*prices[(nums.length -i-1)];
        }

        return sum;

    }



}
