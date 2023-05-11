package javaOdevleri;
import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int km,age,tip;
        double total ,yasİnd ,tipİnd=0.0;

        System.out.print("Gidiceğiniz mesafeyi km cinsinden giriniz: ");
        km = inp.nextInt();
        System.out.print("yasınızı giriniz: ");
        age= inp.nextInt();
        System.out.print(" Yolculuk Tipini Seçiniz\n" +
                         "Tek yön için \'1\' e \n" +
                         "Gidiş-Geliş için \'2\' basınız: ");
        tip= inp.nextInt();

        if(km>0 && age>0){
            switch (tip){
                case 1:
                    total = km * 0.10;

                    if(age<12){
                        yasİnd = total*0.5;
                    }else if(age<24){
                        yasİnd = total*0.1;
                    }else if(age>65){
                        yasİnd = total*0.3;
                    }
                    else {
                        yasİnd=0;
                    }
                    total-=yasİnd;
                    System.out.println(total);
                    break;
                case 2:
                    total = km * 0.10 ;

                    total = km * 0.10;
                    if(age<12){
                        yasİnd = total*0.5;
                    }else if(age<24){
                        yasİnd = total*0.1;
                    }else{
                        yasİnd = total*0.3;
                    }
                   total -= yasİnd;

                    tipİnd = total * 0.2;
                    total-=tipİnd;
                    total = total*2;
                    System.out.println(total);
                    break;
                default:
                    System.out.println("Hatalı Giriş Yaptınız");
                    break;
            }

        }
        else{
            System.out.println("Hatalı Giriş Yaptınız");
        }


    }
}
