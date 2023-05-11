package javaOdevleri;

import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year,a;
        System.out.print("Yıl Giriniz:");
        year= inp.nextInt();


        if(year%4==0 || (year%100==0 && year%400==0)){
            System.out.println(year+ " artık Yıl ");
        }
        else{
            System.out.println(year+ " artık Yıl değildir ");
        }
    }
}
