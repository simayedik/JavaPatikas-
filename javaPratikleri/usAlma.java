package javaPratikleri;

import java.util.Scanner;

public class usAlma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,y,us=1;
        System.out.print("Üsssü alınacak Sayı: ");
        x = inp.nextInt();
        System.out.print("Üs alınacak Sayı: ");
        y = inp.nextInt();


        for(int i=1;i<=y;i++){
            us *=x;
        }

        System.out.print(x+"^"+y + "=" + us);


    }
}
