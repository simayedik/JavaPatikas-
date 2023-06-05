package javaOdevleri;

import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the number for the base: ");

        int n= inp.nextInt();
        for (int i=0 ; i<n;i++){
        for (int j=n ; j>i;j--){
            System.out.print("*");
        }

        for(int k=1;k<=i;k++){
            System.out.print(" ");
        }
            System.out.print("\n");


        }


    }
}
