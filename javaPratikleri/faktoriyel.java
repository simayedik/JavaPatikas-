package javaPratikleri;

import java.util.Scanner;
import java.util.function.Function;

public class faktoriyel {
    public static int faktoriyel(int x){
        int fak=1;
        for (int i=x ;i>1;i--){
            fak *= i;
        }
        return fak;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int xfak=0, yfak=0,xyfak=0; // degişkenler

        System.out.println(" x\'in y\'li kombinasyonu hesaplamak için+");

        System.out.print( "x\'i giriniz: ");
        int x = inp.nextInt();

        System.out.print( "y\'i giriniz: ");
        int y = inp.nextInt();

        // faktoriyel metotundan değerleri aldım
         xfak  = faktoriyel(x);
         yfak = faktoriyel(y);
         xyfak= faktoriyel((x-y));

        int kom = xfak/(yfak*xyfak);
        System.out.println("C("+x+","+y+") = "+kom);









    }
}
