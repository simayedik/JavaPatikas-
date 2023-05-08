package javaPratikleri;

import java.util.Scanner;

public class sınıfGecme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double math,physics,turkish,chemistry,music,avg=0.0;

        System.out.print("Matematik Notunu Giriniz: ");
        math = inp.nextDouble();
        if(math>=0 && math<=100){
        avg += math;
        }
        System.out.print("Fizik Notunu Giriniz: ");
        physics = inp.nextDouble();
        if(physics>=0 && physics<=100){
            avg += physics;
        }
        System.out.print("Kimya Notunu Giriniz: ");
        chemistry = inp.nextDouble();
        if(chemistry>=0 && chemistry<=100){
            avg += chemistry;
        }
        System.out.print("Türkçe Notunu Giriniz: ");
        turkish = inp.nextDouble();
        if(turkish>=0 && turkish <=100){
            avg += turkish;
        }
        System.out.print("Müzik Notunu Giriniz: ");
        music = inp.nextDouble();
        if(music>=0 && music<=100){
            avg += music;
        }

        avg = (avg / 5);

        System.out.println("Ortalamanız : "+ avg);
        if(avg < 55){
          System.out.println("Sınıfta Kaldınız !!!");
        }
        else{
            System.out.println("Tebrikler Sınıfı Geçtiniz  !!!");
        }



    }
}
