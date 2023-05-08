package javaPratikleri;
import java.util.Scanner;
public class havaSicaklikOneri {
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);

         int heat;
         System.out.print("Sıcaklık Değeri Giriniz: ");
         heat = inp.nextInt();

         if(heat<5){
             System.out.println("kayak yapmaya gidebilirsin");
         } else if (heat<=25) {
             if(heat<=15){
                 System.out.println("Sinemaya gidebilirsin");
             }
             if(heat>=10) {
                 System.out.println("Piknik yapabilirsin");
             }
         }else {
             System.out.println("Yüzmeye gidebilirsin");
         }

    }
}
