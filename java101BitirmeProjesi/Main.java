package java101BitirmeProjesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MayinOyunu mayinoyunu = new MayinOyunu();
        int level=0;
        int a=0;
        int b=0;
        while(level==0 || level>4){


        Scanner scn = new Scanner(System.in);
        System.out.print("1 ile 4 arası seviye seçiniz : ");
         level = scn.nextInt();

        switch (level){
            case 1:
                a=2 ;
                b=3;
                break;
            case 2:
                a=3 ;
                b=4;
                break;
             case 3:
                a=5 ;
                b=6;
                break;
            case 4:
                a=7 ;
                b=8;
                break;
            default:
                System.out.println("Yanlış Seçim Terar Seçim Yapınız ");

        }

        }

        mayinoyunu.run(a,b);
       // System.out.println(mayinoyunu.randomNumber());

    }
}
/*
*
*/