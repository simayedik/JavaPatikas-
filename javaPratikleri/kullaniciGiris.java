package javaPratikleri;
import java.util.Scanner;
public class kullaniciGiris {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;
        System.out.print("Kullanıcı Adınız: ");
        userName= inp.nextLine();
        System.out.print("Şifreniz : ");
        password = inp.nextLine();


        if(userName.equals("patika")&& password.equals("java123")){
         System.out.println("Giriş Başarılı");
        } else if (userName.equals("patika")) {
             String selec;
             System.out.print("Şifrenizi Sıfırlamak ister misiniz \n" +
                     "Şifre sıfırlamak için \'y\' Çıkmak için \'n\' basınız: ");
             selec= inp.nextLine();

             switch (selec){
                 case "y":
                        String newUserName;
                        System.out.print("Yeni Parola Giriniz: ");
                        newUserName = inp.nextLine();
                        if (newUserName.equals("java123")){
                            System.out.println("Parolanız önceki parolanızla aynı olamaz");
                            System.out.println("Girişe Yönlendiriliyorsunuz:");
                        }
                        else{
                            System.out.println("Parolanız Başarı ile oluşturuldu ");
                        }
                     break;
                 case "n":
                     System.out.println("Girişe Yönlendiriliyorsunuz:");
                     break;

             }
        } else{
            System.out.println("Giriş yapılamadı");
        }
    }
}
