package javaPratikleri;

import java.util.Scanner;

public class sayiTahminOyunu {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random()*100);
        System.out.println(randomNum);


int counter =0;

while (counter<5){
    Scanner scan = new Scanner(System.in);
    System.out.print("Sayi Tahmininizi Giriniz: ");
    int input = scan.nextInt();
    if(randomNum != input){

        counter++;
        if(counter<5){

            if(randomNum>input){
                System.out.println("Tahmin Yanlış Daha Büyük Sayı Deneyiniz !!!!");
            }
            else {
                System.out.println("Tahmin Yanlış Daha Küçük Sayı Deneyiniz !!!!");

            }
        }
        else {
            System.out.println("Tahmin Yanlış Oyun Bitti" +
                            " Başka Oyunda Şansınızı Deneyiniz !!!!");

        }

    }
    else {
        System.out.println("Tebrikler Tahmin Doğru !!!!");
        break;
    }

}





    }
}
