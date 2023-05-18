package javaPratikleri;

import java.util.Scanner;

public class armstrongSayı {
    public static void main(String[] args) {
/*
      // Armstrong Sayı Bulur
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }
 // bu yorum satırından öncesi Armstrong sayı bulur
*/

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int tempNumber = number;
        int result = 0;

        while (tempNumber != 0) {

            result += tempNumber%10; // sayının son basamak sayısı toplayor
            tempNumber /= 10;
        }
        System.out.println( number+" sayının basamak sayılarının toplamı");
        System.out.println(result);

    }
}
