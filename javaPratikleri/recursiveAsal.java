package javaOdevleri;

import java.util.Scanner;

public class recursiveAsal {
    static void asalMı(int number ){
       int a = number-1;
        if(number ==2){
            System.out.println("Sayı Asal");
        }
        else {
            if(a!=1){

            if(number%a==0){
                System.out.println("Sayı Asal Değil");
            }
            else{
                asalMı(number ,a-1);
            }

            }
            else {
                System.out.println("Sayı Asal ");
            }
        }

    }
    static void asalMı(int number ,int a){
        // int temp = number;
        if(number ==2){
            System.out.println("Sayı Asal");
        }
        else {
            if(a!=1){

                if(number%a==0){
                    System.out.println("Sayı Asal Değil");
                }
                else{
                    asalMı(number ,a-1);
                }

            }
            else {
                System.out.println("Sayı Asal ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Gİrniz : ");
        int number = inp.nextInt();

        asalMı(number);

    }
}
