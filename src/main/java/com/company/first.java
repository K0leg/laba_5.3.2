package com.company;

public class first {

    public static void main(String[] args) {
        for(int i=500;i <= 650;i=i+10){
            System.out.print(i + " ");
        }

        System.out.println(" ");
        int i = 500, j = 500;
        while(i <= 650){
            System.out.print(i + " ");
            i = i + 10;
        }

        System.out.println(" ");
        do{
            System.out.print(j + " ");
            j = j + 10;
        }while (j <= 650);



    }
}