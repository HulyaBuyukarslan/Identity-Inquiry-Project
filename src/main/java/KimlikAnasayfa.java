
import java.util.Scanner;

public class KimlikAnasayfa {

    public static void selectOption() throws InterruptedException {

        System.out.println("----------# KİMLİK ANASAYFASI #----------\n" +
                "1-Kimlik Bilgileri Ekleme\n" +
                "2-Kimlik Bilgileri Arama\n" +
                "3-Kimlik Bilgileri Silme\n" +
                "4-Çıkış");

        Scanner input = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi seçiniz");

        String islem = input.nextLine();

        switch (islem) {
            case "1":
                KimlikMethodlar.saveInfo();
                break;
            case "2":
                KimlikMethodlar.getInfo();
                break;
            case "3":
                KimlikMethodlar.removeInfo();
                break;
            case "4":
                KimlikMethodlar.cikis();
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız. Tekrar deneyiniz. ");
                selectOption();

        }

    }

}
