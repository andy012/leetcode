package com.online.test;

import java.util.Scanner;

/**
 * Created by andy on 9/4/16.
 */
public class JDMoNiTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            boolean flag= false;

            for(int i = start;i<=end;++i){
                if(isShuixianhua(i)){
                    if(flag) {
                        System.out.print(" " + i);
                    }else {
                        flag = true;
                        System.out.print(i);
                    }
                }
            }
            if(!flag){
                System.out.println("no");
            }else {
                System.out.println();
            }

        }
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
