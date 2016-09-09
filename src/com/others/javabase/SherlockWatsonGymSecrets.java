package com.others.javabase;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by andy on 8/28/16.
 */
public class SherlockWatsonGymSecrets {
    private static int mod=1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();

        for (int i = 1; i <= t; i++) {

            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int N = scanner.nextInt();
            int K =scanner.nextInt();

            BigInteger bigInteger=BigInteger.ONE;

            for(int i1= 1;i1<=N;++i1 ){
                for(int j=1;j<=N;++j){
                    if(i1!=j){
                        long a1=quick_mod(i1,A);
                        long a2 = quick_mod(j,B);
                        if((a1+a2)%mod ==0){
                            bigInteger=bigInteger.add(BigInteger.ONE);
                        }

                    }
                }
            }
            System.out.println(bigInteger.mod(new BigInteger("1000000007")));

        }
    }

    public static long quick_mod(long a,long p)          //快速幂 (快速幂利用了二分思想和秦九昭算法)
    {
        long ans=1;
        while(p!=0)
        {
            if((p&1L) != 0)
                ans=ans*a%mod;
            a=a*a%mod;
            p>>=1;
        }
        return ans;
    }
}
