package com.company;


public class fifth {

    public static void main(String[] args) {

        int num1 = 0, num2 = 0;
        for(int i = 0; i <= 24; i++){
            for(int f = 0; f <= 59; f++){
                if(i >= 0 && i <= 9) {
                    if(i == f) {
                        System.out.println("0" + i + ":" + "0" + f);
                    }
                    if(i == (f / 10) && i != 0 && (f % 10) == 0){
                        System.out.println("0" + i + ":" + f);
                    }
                }

                else if(i >= 10 && i <= 23) {
                    num1 = i / 10;
                    num2 = i % 10;

                    if(i == f || num1 == f || num2 == f){
                        if(f > 9){
                            System.out.println(i + ":" + f);
                        }
                    }

                }
            }
        }
    }
}