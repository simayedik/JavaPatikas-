package javaPratikleri;
import java.util.Scanner;
public class burcBulma {
    public static void main(String[] args) {
           Scanner inp = new Scanner(System.in);

           int day,mouth;

           System.out.print("Doğduğunu ayı giriniz : ");
           mouth = inp.nextInt();
           System.out.print("Doğduğunu günü giriniz : ");
           day = inp.nextInt();


           if(mouth ==3 && day>20 ||mouth==4 && day<21 ){
               System.out.print("Burçunuz Koç" );
           }
           else if(mouth ==4 && day>20 || mouth==5 && day<22 ){
               System.out.print("Burçunuz Boğa" );
           }
           else if(mouth ==5 && day>21 || mouth==6 && day<23 ){
               System.out.print("Burçunuz ikizler" );
           }
           else if(mouth ==6 && day>22 || mouth==7 && day<23 ){
               System.out.print("Burçunuz yengeç" );
           }
           else if(mouth ==7 && day>22 || mouth==8 && day<23 ){
               System.out.print("Burçunuz Aslan" );
           }
           else if(mouth ==8  && day>22 || mouth==9 && day<23 ){
               System.out.print("Burçunuz Başak" );
           }
           else if(mouth ==9 && day>22 || mouth==10 && day<23 ){
               System.out.print("Burçunuz terazi" );
           }
           else if(mouth ==10 && day>22 || mouth==11 && day<22 ){
               System.out.print("Burçunuz Akrep" );
           }
           else if(mouth ==11 && day>21 || mouth==12 && day<22 ){
               System.out.print("Burçunuz Yay" );
           }
           else if(mouth ==12 && day>21 || mouth==1 && day<22 ){
               System.out.print("Burçunuz Oğlak" );
           }
           else if(mouth ==1 && day>21 || mouth==2 && day<20 ){
               System.out.print("Burçunuz Kova" );
           } else if(mouth ==2 && day>19 || mouth==3 && day<21 ){
               System.out.print("Burçunuz Balık" );
           }



    }
}
