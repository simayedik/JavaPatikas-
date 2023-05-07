package javaPratikleri;
import  java.util.Scanner;
public class daireAlanıHesp {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int r;
        double area ,milieu;

        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = inp.nextInt();


        milieu =( Math.PI*2*r) ;
        area = (Math.PI*r*r);

        System.out.println("Dairenin Çevresi : " + milieu);
        System.out.println("Dairenin Alanı : "+area );

    }
}
