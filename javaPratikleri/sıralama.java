package javaPratikleri;
import java.util.Scanner;
public class sıralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double num1,num2,num3;

        System.out.print("1.Sayı:");
        num1 = inp.nextDouble();

        System.out.print("2.Sayı:");
        num2 = inp.nextDouble();

        System.out.print("3.Sayı:");
        num3 = inp.nextDouble();

        if(num1<num2 && num1<num3) {
            System.out.println("En küçük sayınız " + num1);

            if(num2<num3){
                System.out.println("Ortanca sayınız " + num2);
                System.out.println("En büyük sayınız " + num3);
            }else{
                System.out.println("Ortanca sayınız " + num3);
                System.out.println("En büyük sayınız " + num2);
            }


        } else if (num2<num1 && num2<num3) {
            System.out.println("En küçük sayınız " + num2);

            if(num1<num3){
                System.out.println("Ortanca sayınız " + num1);
                System.out.println("En büyük sayınız " + num3);
            }
            else{
                System.out.println("Ortanca sayınız " + num3);
                System.out.println("En büyük sayınız " + num1);
            }


        }
        else if(num3<num2 && num3<num1){
            System.out.println("En küçük sayınız " + num3);

            if(num2<num1){
                System.out.println("Ortanca sayınız " + num2);
                System.out.println("En büyük sayınız " + num1);
            }
            else{
                System.out.println("Ortanca sayınız " + num1);
                System.out.println("En büyük sayınız " + num2);
            }


       }
    }
    //5-4-3
}
