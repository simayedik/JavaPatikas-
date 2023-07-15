package java101BitirmeProjesi;

import java.util.Random;
import java.util.Scanner;

public class MayinOyunu {

    public int randomNumber(int c){
        Random rnd = new Random();
        int num = rnd.nextInt(c);

        return num;
    }
    public void mineLaying(int a ,int b,String tarla[][]){

        int mineNumber =( a*b )/4; // mayin sayısı hesaplama

       for(int i = 0 ; i<mineNumber;i++){
           int num1 = randomNumber(a);
           int num2 = randomNumber(b);  // random sayı alarak mayınları yerleştirme

           if(tarla[num1][num2]!="*"){
               tarla[num1][num2]="*";
               if(num1-1>0&&(num1-1)<a && tarla[num1-1][num2]!="*"){
                   int t ;

                       t= Integer.parseInt(tarla[num1-1][num2]);

                   t++;
                   tarla[num1-1][num2]=String.valueOf(t);
               }
               if(num1+1<a && tarla[num1+1][num2]!="*"){
                   int t ;

                       t= Integer.parseInt(tarla[num1+1][num2]);

                   t++;
                   tarla[num1+1][num2]=String.valueOf(t);
               }
               if(num2-1>0 && tarla[num1][num2-1]!="*"){
                   int t ;

                       t=Integer.parseInt(tarla[num1][num2-1]);

                   t++;
                   tarla[num1][num2-1]=String.valueOf(t);
               }
               if(num2+1<b &&tarla[num1][num2+1]!="*"){
                   int t ;

                       t=Integer.parseInt(tarla[num1][num2+1]);

                   t++;
                   tarla[num1][num2+1]=String.valueOf(t);
               }
           }else {
               i--; // mayın olan yere tekrar mayın koymamak için
           }

       }
/* Mayınların nerde olduğunu gösterir
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(tarla[i][j]+"  " );
            }
            System.out.println();
        }
*/


    }

    public void run(int a,int b){

        String tarla[][] = new String[a][b] ;
        String start[][] = new String[a][b] ;


        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                tarla[i][j] = "0";
                start[i][j] = "-";
            }
        }


        mineLaying(a,b,tarla ); // mayınları yerleştirme
        System.out.println("MAYIN TARLASI OYUNUNA HOŞ GELDİNİZ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(start[i][j]+"  " );
            }
            System.out.println();
        }



        boolean gameover = false;
        int counter=0;
        int returnNum = ((a*b)-(a*b/4));

        while(counter<returnNum){

            Scanner scn = new Scanner(System.in);
            System.out.print("Satırı Giriniz: ");
            int line =scn.nextInt(); // satır = a
            System.out.print("Sütunu Giriniz: ");
            int column =scn.nextInt(); // sütun = b

            start[line-1][column-1]=tarla[line-1][column-1];

        if(tarla[line-1][column-1]=="*"){
            gameover=true;
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    System.out.print(start[i][j]+"  " );
                }
                System.out.println();
            }

            System.out.println("-----Game Over-----");
            break;
        }
        else {
           counter++;

            System.out.println("---İyi Gidiyorsun Devammm ----");

            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    System.out.print(start[i][j]+"  " );
                }
                System.out.println();
            }

        }
        }
        if(counter==returnNum){
            System.out.println("-----Tebrikler Kazandın-----");
        }

    }



    }




