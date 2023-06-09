package javaOdevleri;

import java.util.Scanner;

public class recursiveUs {
    static  int Us(int number ,int us){
        if(us==1){
            return number;
        }
        else{
            return number * Us(number,(us-1));
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Üs Alınacak Sayı Giriniz:");
        int number = scan.nextInt();
        System.out.print(" Üs Giriniz:");
        int us = scan.nextInt();

        System.out.println(Us(number,us));
    }
}
