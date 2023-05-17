package javaPratikleri;

import java.util.Scanner;

public class ciftSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: "); 
        int num =inp.nextInt();  // kullanıcıdan girdi alırız

        for(int i=0;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
       // Bu for ödev  3 ve 4 e bölünen sayıları bulmak için
        for(int i=0;i<=num;i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
            }
        }
    }
}
