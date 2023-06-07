package javaOdevleri;

import java.util.Scanner;

public class asalSayılar {
    public static void main(String[] args) {
System.out.print("2");

        for(int i=3;i<=100;i++){
            boolean asal = true;
         for(int j=2;j<i;j++){

             if(i%j==0){
                 asal = false;
             }

         }
            if(asal){
                System.out.print(" - "+i);
            }
        }
    }
}
