package javaPratikleri;

public class diziElemanOrtalamasi {
    public static void main(String[] args) {
        int[] numbers = {3,4,7,8,23};
        double sum =0;
        for(int i=0;i<numbers.length;i++){
           sum += (double)1/numbers[i];

        }
        System.out.println("Harmonik Ortalaması : " +(numbers.length/sum));

    }
}
