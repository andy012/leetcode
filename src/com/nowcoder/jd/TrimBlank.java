package com.nowcoder.jd;

import java.util.Scanner;

/**
 * Created by andy on 9/5/16.
 */
public class TrimBlank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            FormatString(scanner.nextLine().toCharArray());
        }
    }

    public static void FormatString(char str[]){
        int pos;
        for( pos=str.length-1;pos>=0;pos--){
            if(str[pos] != ' ') break;
        }
        for (int i = 0; i <= pos; i++) {
            if(str[i] != ' '){
                System.out.print(str[i]);
            }else {
                if(i > 0 && str[i-1] != ' ' ){
                    System.out.print(str[i]);
                }
            }
        }

        System.out.println();
    }

}
