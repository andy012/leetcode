package com.leetcode;

import java.util.Scanner;

/**
 * Created by andy on 9/10/16.
 */
public class UniquePathsII63 {
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
            System.out.println(uniquePathsWithObstacles(obstacleGrid));
        }
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] paths = new int[obstacleGrid.length][obstacleGrid[0].length];

        for(int i = 0;i< paths.length;++i){
            for (int j=0;j<paths[0].length;++j){
                if(obstacleGrid[i][j] != 0){
                    paths[i][j] = 0;
                }else {
                    if (i == 0 && j==0) {
                        paths[i][j] = 1;
                    }else if(i==0 && j!=0){
                        paths[i][j] = paths[i][j-1] ;
                    } else if(i!=0 && j==0){
                        paths[i][j] = paths[i - 1][j];
                    }else {
                        paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                    }
                }
            }
        }

        return paths[paths.length -1][paths[0].length -1];
    }
}
