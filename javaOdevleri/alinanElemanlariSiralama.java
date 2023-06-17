package javaPratikleri;

import java.util.Scanner;

public class alinanElemanlariSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("dizi boyutu: ");
        int n= inp.nextInt();
        int temp ;

        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Dizinin "+(i+1)+".elemanın giriniz: ");
            numbers[i]= inp.nextInt();
        }
        // sıralama
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(numbers[i]<numbers[j]&& i!=j){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }
        // yazdırma
        for(int a=0;a<n;a++){
            System.out.print( numbers[a]+"  ");

        }

    }
}
