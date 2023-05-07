package javaPratikleri;
import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kdv;
        int fiyat;
        System.out.print("KDV\'Siz Ürun Fiyatı Giriniz: ");
        fiyat = inp.nextInt();


        if(fiyat>0 && fiyat<1000){
            kdv = 0.18;
        }
        else{
            kdv =0.08;
        }

        double kdvTutarı = (fiyat*kdv);
        double kdvFiyatı = (kdvTutarı +fiyat);
        System.out.println("KDV Oranı :  "+kdv);
        System.out.println("KDV\'siz Fiyat:  "+fiyat);
        System.out.println("Ürünün KDV tutarı :  "+kdvTutarı);
        System.out.println("KDV\'li Fiyat:  "+kdvFiyatı);

    }
}


