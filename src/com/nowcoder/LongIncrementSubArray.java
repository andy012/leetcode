package com.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 最长公共子序列问题
 *
 */
public class LongIncrementSubArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int t=scanner.nextInt();

        for (int i = 0; i < t ; i++) {
            int num = scanner.nextInt();

            int [] a=new int[num];
            int [] b=new int[num];

            for (int j = 0; j < num; j++) {
                a[j]=scanner.nextInt();
                b[j]=a[j];
            }
            Arrays.sort(b);
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));

            int [][] c=new int[a.length+1][b.length+1];

            int len=findLengthSubArray(a,b,c);


            System.out.println(len);

        }

    }

    public static  int  findLengthSubArray(int[]a,int[]b,int[][]c){

        for (int i=0;i<=a.length;++i){
            for (int j = 0; j <= b.length; j++) {

                if(i==0 || j==0) c[i][j]=0;
                else {
                    if(a[i-1]==b[j-1]) c[i][j]=c[i-1][j-1]+1;
                    else {
                        c[i][j]=Math.max(c[i][j-1],c[i-1][j]);
                    }
                }

            }
        }

        for (int[] ar:c){
            System.out.println(Arrays.toString(ar));
        }


        return c[a.length][b.length];
    }


    public static List<Integer> printLCS(int[]a,int[]b,int[][]c){
        int i = 0, j = 0;
        List<Integer> values=new ArrayList<Integer>();
        while (i< a.length && j < b.length){
            if(a[i]== b[j]){
                values.add(a[i]);
                i++;j++;
            }else if(c[i+1][j] >= c[i][j+1]){
                i++;
            }else {
                j++;
            }
        }
        return values;
    }

//    public static  int  findLengthSubArrayRecursion(int[]a,int[]b,int[][]c,int m,int n) {
//
//
//    }



    public static int LIS(int[] array){
        int[] LIS=new int[array.length];
        for(int i=0;i<array.length;++i){
            LIS[i]=1;
            for (int j = 0; j < i; j++) {

                if(array[i] > array[j] && LIS[j]+1 > LIS[i]){
                    LIS[i]=LIS[j]+1;
                }
            }
        }
        return max(array);
    }


    public static int max(int[] array){
        int max=Integer.MIN_VALUE;
        for (int a:array){
            if(max< a) max=a;
        }
        return max;
    }


}
