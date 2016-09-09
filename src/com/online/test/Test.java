package com.online.test;

import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * Created by andy on 9/4/16.
 */
public class Test {

    double[] a=new double[2];

    public static void main(String[] args) {

        Test test=new Test();

        Class<?> cls = test.a.getClass();
        System.out.println(cls.getSimpleName());
        int mod = cls.getModifiers();

//        System.out.println(mod);

        System.out.println(Modifier.isPrivate(mod));
        System.out.println(Modifier.isProtected(mod));
        System.out.println(Modifier.isPublic(mod));


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
