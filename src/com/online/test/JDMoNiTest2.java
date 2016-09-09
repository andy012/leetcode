package com.online.test;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by andy on 9/4/16.
 */
public class JDMoNiTest2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            double sum = n;
            double tmp= n;
            for (int i = 1; i < m; i++) {
                tmp = Math.sqrt(tmp);
                sum +=tmp;
            }
            DecimalFormat df = new DecimalFormat(".00");
            System.out.println(df.format(sum));



        }
    }



}
