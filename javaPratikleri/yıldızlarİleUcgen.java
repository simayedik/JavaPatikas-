package javaPratikleri;

import java.util.Scanner;

public class yıldızlarİleUcgen {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = inp.nextInt();


        for(int i=1;i<=n;i++){
            for(int k=0;k<(n-i)/2;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
              if(i%2!=0){
                  System.out.print("*");
              }
            }
            System.out.println("");
        }
    }
}
