package javaPratikleri;
import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double num1,num2,selection=1.0,result=0.0;

        System.out.print("Birinci Sayıyı Giriniz:");
        num1 = inp.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz:");
        num2 = inp.nextDouble();

        System.out.print("İşlemler\n"+
                "1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Çarpma\n" +
                "4-Bölme\n" +
                "Seciminiz: ");

        selection= inp.nextDouble();

        switch ((int) selection){
            case 1:
                 result = (num1 +num2);
                 System.out.print(result);
                 break;
            case 2:
                result = (num1 -num2);
                System.out.print(result);
                break;
            case 3:
                result = (num1 * num2);
                System.out.print(result);
                break;
            case 4:
                result = (num1 / num2);
                System.out.print(result);
                break;
            default:
                System.out.println("Yanlış Secim Yaptınız");
        }

    }

}
