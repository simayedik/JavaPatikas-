package javaPratikleri;

import java.util.Scanner;

public class İkininKuvveti {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        System.out.print("Sınır sayı giriniz : ");
        int limit = inp.nextInt(); // sınır sayı alıyoruz

        System.out.println("Girdiginiz sayıya kadar olan  2nin katları");

        for(int i=1;i<limit;i*=2){
            System.out.println(i);
        }
    }
}
