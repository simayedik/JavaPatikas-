import java.util.Scanner;
public class notOrtalamasıH {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);

      int mat ,fizik ,kimya,turkce ,tarih ,muzik ;

      System.out.print("Matematik Notunu Giriniz: ");
      mat = inp.nextInt();
      System.out.print("Fizik Notunu Giriniz: ");
      fizik = inp.nextInt();
      System.out.print("Kimya Notunu Giriniz: ");
      kimya  = inp.nextInt();
      System.out.print("Türkçe Notunu Giriniz: ");
      turkce= inp.nextInt();
      System.out.print("Tarih Notunu Giriniz: ");
      tarih = inp.nextInt();
      System.out.print("Müzik Notunu Giriniz: ");
      muzik= inp.nextInt();
      int toplam = ( mat + fizik + kimya + turkce + tarih + muzik);
      double ort = (toplam / 6.0) ;

      while(ort<60.0){
          System.out.println("Başarısız Oldunuz !!! ");
          System.out.println("Ortalamanız : " + ort);
          return;
      }
      System.out.println("Tebrikler Başarılı Oldunuz !!! ");
      System.out.println("Ortalamanız : " + ort);



    }
}
