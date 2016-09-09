package com.others.javabase.test;

import com.online.test.Test;

/**
 * Created by andy on 9/4/16.
 */
public class Test1 {

    int[] a=new int[2];
    public static void main(String[] args) {

        Test test=new Test();

    }


    public static boolean isShuixianhua(int n){

        int sum = 0;
        int tmp = n;


        while (tmp != 0){
            sum += Math.pow(tmp%10,3);
            tmp /= 10;
        }


        if(sum == n) return true;
        else  return false;

    }
}
