package com.nowcoder;

import java.util.Scanner;

/**
 * Created by andy on 9/5/16.
 */
public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cache=new int[100001];
        for(int k=1 ;k< 100001;++k){
            if (f(k)==g(k)){
                cache[k] = 1;
            }
        }
        int tmp =0;
        for(int k=1;k<100001;++k){
            tmp += cache[k];
            cache[k] = tmp;
        }
        int T = scanner.nextInt();
        for (int  i= 0;  i < T ;  i++) {
            int n = scanner.nextInt();

//            int sum = 0;
//            for(int j=1;j<=n ;++j){
//                if(f(j) == g(j))
//                    sum++;
//            }
            System.out.println(cache[n]);

        }
    }

    public static int f(int n){
        int sum =0;
        while (n > 0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public  static int g(int n){
        int sum =0;
        do
        {
            if(n%2==1)
                sum++;
            n=n/2;
        }
        while(n!=0);
        return  sum;
    }

}
