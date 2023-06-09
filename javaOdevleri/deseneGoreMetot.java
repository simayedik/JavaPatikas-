package javaOdevleri;

public class deseneGoreMetot {
    static  void pattern(int number,int counter){
       int temp = number;
        System.out.print(number+" ");
      if(number!=0){
          if(number > 0 && counter == 0){

              pattern(number-5,counter,temp);
          }


          else if(number<=0) {
              counter =1;
              pattern(number+5,counter,temp);
          }

      }


    }
    static  void pattern(int number,int counter,int temp){

        System.out.print(number+"  ");
        if(number > 0 && counter == 0){

            pattern(number-5,counter,temp);
        }
        else if (number>0&&number<temp && counter==1) {
            pattern(number+5,counter,temp);
        }

        else if(number<=0) {
            counter =1;

            pattern(number+5,counter,temp);
        }


    }



    public static void main(String[] args) {
    pattern(16,0);
    }
}
