package javaOdevleri;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner inp  =new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz: ");
         int n  = inp.nextInt();
         int min=0  ,max =0;
         for (int i =1 ; i<=n ;i++){
             System.out.print(i+"-sayı giriniz :");
              int num = inp .nextInt();
             if(min==0){
                 min = num;
             }
              if(min>num){
                  min = num;
              }
              if(max<num){
                  max = num;
              }
         }
         System.out.println( max);
        System.out.println( min);

    }
}
