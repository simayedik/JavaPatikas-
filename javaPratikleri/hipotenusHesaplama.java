package javaPratikleri;
import java.util.Scanner;
public class hipotenusHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double hip,cevre,alan;
        System.out.print("1.Kenarı Giriniz: ");
        int a = inp.nextInt();
        System.out.print("2.Kenarı Giriniz: ");
        int b = inp.nextInt();
        hip=  Math.sqrt( (a*a) + (b*b) );
        cevre = (a+b+hip);
        alan =  (a*b/2);
        System.out.println("Hipotenüs: "+ hip);
        System.out.println("Cevre : "+ cevre);
        System.out.println("Alan : " + alan);


    }
}
