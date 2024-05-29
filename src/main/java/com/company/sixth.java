package com.company;

public class sixth {

    public static void main(String[] args) {

        int number = 0;

        for(int i = 1; i <= 999999; i++) {
            int num3 = (i / 100) % 10;
            int num2 = (i / 10) % 10;
            int num1 = i % 10;
            int num4 = (i / 1000) % 10;

            int num5 = (i / 10000) % 10;
            int num6 = (i / 100000) % 10;
            if(num1 + num2 + num3 == num4 + num5 + num6){
                number++;
            }
        }
        System.out.println("Кількість чисел " + number);
    }

}