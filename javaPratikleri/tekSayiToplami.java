package javaPratikleri;

import java.util.Scanner;

public class tekSayiToplami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
       System.out.print("Negatif sayı Girene kadar girdiğiniz negatif sayılar toplanacak \n" +
                         "sayi giriniz: ");
        int num = inp.nextInt() ;
        int total =0;

        while(num>0){
            if(num%2!=0){
                total += num;
            }
            System.out.print("Tekrar bir sayı giriniz: ");
             num = inp.nextInt() ;
        }
        System.out.println("Girdiğiniz negatif sayıların Toplamı: "+total);

        // yorum satırına alınan bölüm ödev girilen cift sayılardan 4 katı olanları toplayan program
       /*
        System.out.print("Tek sayı girene kadar girdiğiniz sayıların 4 katı olanlar toplanacak \n" +
                "sayi giriniz: ");
        int num2 = inp.nextInt() ;
        int total2 =0;

        while(num2%2==0){
            if(num2%4==0){
                total2 += num2;
            }
            System.out.print("Tekrar bir sayı giriniz: ");
            num2 = inp.nextInt() ;
        }
        System.out.println("Girdiğiniz pozitif sayılarda 4 katı olan sayıların Toplamı: "+total2);
        */

    }
}
