package javaPratikleri;

import java.util.Scanner;

public class ebob_ekok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int min =0,ebob=0,ekok=0;
        System.out.print("Birinci sayiyi giriniz: ");
        int num1 =inp.nextInt();

        System.out.print("İkinci sayiyi giriniz: ");
        int num2 =inp.nextInt();

        if(num1<num2){
            min=num1;
        }else{
            min=num2;
        }
System.out.println(min);
       while(min>1){
          if(num1%min==0 && num2%min==0){
              ebob = min;
              break;
          }
  min--;
        }
        ekok =( (num2*num1)/ebob);
        System.out.println("EBOB:"+ ebob);
        System.out.println("EKOK:"+ ekok);
    }
}
