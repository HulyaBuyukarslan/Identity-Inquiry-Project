import java.util.Scanner;
public class KimlikAnasayfa {

static Scanner input = new Scanner(System.in);

public static void selectOption() throws InterruptedException {
    System.out.println("----------# KİMLİK ANASAYFASI #----------\n" +
            "1-Kimlik Bilgileri Ekleme\n" +
            "2-Kimlik Bilgileri Arama\n" +
            "3-Kimlik Bilgileri Silme\n" +
            "4-Çıkış");
    System.out.println("Yapmak istediğiniz işlemi seçiniz");
    String islem = input.nextLine();

    boolean secim = true;
    do {
        switch (islem) {
            case "1":
             KimlikMethodlar.saveInfo();
                secim = false;
                break;
            case "2":
               KimlikMethodlar.getInfo();
                secim= false;
                break;
            case "3":
             KimlikMethodlar.removeInfo();
                secim = false;
                break;
            case "4":
                System.out.println("Sayfamizi ziyaret ettiginiz icin tesekkur ederiz");
                secim= false;
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız. Tekrar giriş yapınız");
                islem = input.nextLine();
        }
    }while (secim);

    }

}
