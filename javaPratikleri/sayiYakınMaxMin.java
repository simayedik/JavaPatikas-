package javaPratikleri;

import java.util.Scanner;

public class sayiYakınMaxMin {

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Bir Sayı Giriniz");
            int number  = inp.nextInt();

            int[] list = {15,12,788,1,-1,-778,2,0};

            int nearMin=0;
            int nearMax=0;
            int temp =0;

            for (int i : list) {

                if (i < number && i>nearMin) {
                    nearMin = i;

                }
                if(i>number){


                if (  i > temp ) {
                    nearMax= temp;
                }
                else {
                    nearMax = i;
                }
                    temp = i;
                }
            }


            System.out.println("Minimum Değer " + nearMin);
            System.out.println("Maximum Değer " + nearMax);

        }

}
