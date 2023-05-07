package javaOdevleri;
import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        /*
        Armut : 2,14 TL pear
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL bananas
        Patlıcan : 5,00 TL eggplant
        */
        Scanner inp = new Scanner(System.in);
        double pearPrice=2.14,applePrice=3.67,tomatoPrice=1.11,bananasPrice=0.95,eggplantPrice=5.00;
        double pear ,apple,tomato ,bananas,eggplant,total=0;

        System.out.print("Armut\'un Kilosunu Giriniz (örn = 3,4): ");
        pear= inp.nextDouble();
        total += (pear * pearPrice);

        System.out.print("Elma\'ın Kilosunu Giriniz (örn = 3,4): ");
        apple= inp.nextDouble();
        total += ( apple* applePrice);

        System.out.print("Domates\'in Kilosunu Giriniz (örn = 3,4): ");
        tomato = inp.nextDouble();
        total += ( tomato * tomatoPrice);

        System.out.print("Muz\'un Kilosunu Giriniz (örn = 3,4): ");
        bananas= inp.nextDouble();
        total += ( bananas * bananasPrice );

        System.out.print("Patlıcan\'nın Kilosunu Giriniz (örn = 3,4) :");
        eggplant= inp.nextDouble();
        total += ( eggplant * eggplantPrice);

        System.out.println("Toplam Ödenecek Tutar : " + total );


    }
}
