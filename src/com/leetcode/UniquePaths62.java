package com.leetcode;

import java.util.Scanner;

/**
 * Created by andy on 9/10/16.
 */
public class UniquePaths62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            int m = scanner.nextInt();
            int n = scanner.nextInt();

            System.out.println(uniquePaths(m,n));


        }
    }

    public static int uniquePaths(int m, int n) {

        int[][] paths = new int[m][n];
        for(int i = 0;i< m;++i){
            for (int j=0;j<n;++j){
                if(i ==0 || j==0){
                    paths[i][j] = 1;
                }else {
                    paths[i][j] = paths[i-1][j]+paths[i][j-1];
                }
            }
        }

        return paths[m-1][n-1];
    }

}
