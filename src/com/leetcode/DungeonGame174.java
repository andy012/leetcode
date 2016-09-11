package com.leetcode;

import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by andy on 9/10/16.
 */
public class DungeonGame174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] obstacleGrid = new int[m][n];
            for (int i=0;i<m;++i){
                for (int j=0;j<n;++j){
                    obstacleGrid[i][j] = scanner.nextInt();
                }
            }
            System.out.println(calculateMinimumHP(obstacleGrid));
        }
    }
    public static int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length][dungeon[0].length];

        for(int i = dp.length-1;i>=0;i--){
            for (int j=dp[0].length-1;j>=0;--j){

                if (i == dp.length-1 && j==dp[0].length-1) {
                    dp[i][j] = Math.max(-dungeon[i][j],0);
                }else if(i==dp.length-1 && j!=dp[0].length-1){
                    dp[i][j] = Math.max(dp[i][j+1] - dungeon[i][j],0);
                } else if(i!=dp.length-1 && j==dp[0].length-1){
                    dp[i][j] = Math.max(dp[i + 1][j] - dungeon[i][j],0);
                }else {
                    dp[i][j] =Math.max( Math.min(dp[i + 1][j] , dp[i][j + 1]) - dungeon[i][j],0);
                }

            }
        }

        return dp[0][0]+1;
    }
}
