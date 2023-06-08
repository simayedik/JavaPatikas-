package javaOdevleri;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new  Scanner(System.in);
        System.out.print("Fibonacci Serisinin Kaç Elemanını Görmek İstersiniz: ");
        int n = inp.nextInt();
int result = 1,prev=0,prevPrev;

        for(int i=1;i<n;i++){

            System.out.println(prev+" + " + result +" = "+ (result+prev));
            prevPrev = prev;
            prev = result;
            result += prevPrev;
        }

    }
}
