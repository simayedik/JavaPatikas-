package javaPratikleri;

import java.util.Scanner;

public class alinanElemanlariSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("dizi boyutu: ");
        int n= inp.nextInt();

        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Dizinin "+(i+1)+".elemanın giriniz: ");
            numbers[i]= inp.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print( numbers[i]+"  ");

        }

    }
}
