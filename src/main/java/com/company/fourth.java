package com.company;

public class fourth {

    public static void main(String[] args) {

        int n = 10, f = 1, d = 1;
        for(int i = 1; i<=n; i++) {
            f = f * i;
        }

        int i = 1;
        while(i <= n){
            d = d * i;
            i++;
        }

        System.out.println(n+"! = "+f);
        System.out.println(n+"! = "+d);

    }
}