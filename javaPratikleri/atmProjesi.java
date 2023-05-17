package javaPratikleri;

import java.util.Scanner;

public class atmProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username,password;
        int right=3,select,balance =20000;
        while(right>0) {

            System.out.print("Kullanıcı Adınız :");
            username = inp.nextLine();
            System.out.print("Parolanız : ");
            password = inp.nextLine();
            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Bankamıza Hoşgeldiniz ");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak isteğiniz Para miktarı : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz Para miktarı : ");
                            int price2 = inp.nextInt();
                            if (price2 > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price2;
                                System.out.println("Kalan Bakiye : "+balance);
                                System.out.println();
                            }

                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("İyi Günler Yine bekleriz");
                            break;
                        default:
                            System.out.println("Geçersiz işlem !!!");
                            break;
                    }
                } while (select != 4);
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }//else
        }// while
    }
}
