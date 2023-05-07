package javaOdevleri;
import java.util.Scanner;
public class vucutİndeksi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double weight, height ,indeks;

        System.out.print("Boyunuzu Giriniz(metre)(örn:1,60) :");
        height = inp.nextDouble();

        System.out.print("Kilonuzu Giriniz(kg)(örn:54) :");
        weight= inp.nextDouble();

        indeks = (weight / (height * height));



        if(indeks<18.5){
            System.out.println("Vücüt Kilo İndeksiniz : "+ indeks);
          System.out.println("Kilonuz İdeal kilonun altında");
        }
        else if(indeks >= 18.5 && indeks<=25){
            System.out.println("Vücüt Kilo İndeksiniz : "+ indeks);
            System.out.println("Kilonuz İdeal");
        }
        else if(indeks >= 25 && indeks<30){
            System.out.println("Vücüt Kilo İndeksiniz : "+ indeks);
            System.out.println("Kilonuz İdeal kilonun üstünde");
        }
        else if(indeks >= 30 && indeks<40){
            System.out.println("Vücüt Kilo İndeksiniz : "+ indeks);
            System.out.println("Kilonuz İdeal kilonun çok üstünde (obez)");
        }
        else{
            System.out.println("Vücüt Kilo İndeksiniz : "+ indeks);
            System.out.println("Kilonuz İdeal kilonun çok üstünde (morbid obez):");
        }
        /*
        18, 5 kg/m² ‘nin altındaki sonuçlar: İdeal kilonun altında
        18, 5 kg/m² ile 24, 9 kg/m² arasındaki sonuçlar: İdeal kiloda
        25 kg/m² ile 29, 9 kg/m² arasındaki sonuçlar: İdeal kilonun üstünde
        30 kg/m² ile 39, 9 kg/m² arasındaki sonuçlar: İdeal kilonun çok üstünde (obez)
        40 kg/m² üzerindeki sonuçlar: İdeal kilonun çok üstünde (morbid obez)
        */
    }
}
