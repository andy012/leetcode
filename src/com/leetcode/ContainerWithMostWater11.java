package com.leetcode;

import java.util.Scanner;

/**
 * Created by andy on 9/11/16.
 */
public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] citations = new int[n];

            for(int i=0;i<n;++i){
                citations[i] = scanner.nextInt();
            }
            System.out.println(maxArea(citations));
        }
    }


    public static int maxArea(int[] height) {
        int ans = 0;
        int l=0,r=height.length -1;
        while (l<r){
            int v = Math.min(height[l],height[r])*(r - l );
            ans = Math.max(ans,v);
            if(height[l] < height[r]) l++;
            else r--;
        }
        return ans;
    }
}
