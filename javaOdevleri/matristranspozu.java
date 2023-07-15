package javaOdevleri;

public class matristranspozu {
    public static void main(String[] args) {
        int[][] matris = new int[2][3];
        matris[0][0]=2;
        matris[0][1]=3;
        matris[0][2]=4;

        matris[1][0]=5;
        matris[1][1]=6;
        matris[1][2]=4;


        int[][] transpoz = new int[matris[0].length][matris.length];
        for(int i=0;i<matris.length;i++){
            for(int j=0;j< matris[0].length;j++){
               transpoz[j][i] = matris[i][j];
            }

        }
        for(int i=0;i<transpoz.length;i++){
            for(int j=0;j< transpoz[0].length;j++){

                System.out.print( transpoz[i][j]+" ");
            }
            System.out.println( );
        }


    }
}
