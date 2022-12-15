import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class KimlikMethodlar {

    static Scanner input = new Scanner(System.in);
    static Map<String, KimlikPojo> kimlikListesi = new HashMap<>();
    static Set<String> kimlikNumaralari = kimlikListesi.keySet();


    public static void saveInfo() throws InterruptedException {
        System.out.println("----------# KİMLİK BİLGİLERİ EKLEME SAYFASI #----------");
        System.out.println("Eklemek istediğiniz kimlik numarasını 4 haneli olarak giriniz");
        String kimlikNumarasi = input.nextLine();

        if (kimlikNumarasi.matches("[0-9]{4}")) {
            if (kimlikNumaralari.contains(kimlikNumarasi)) {
                System.out.println("Kullanılan Kimlik numarası...\n Yeniden giriş yapınız...");
                saveInfo();
            } else {
                System.out.println("Eklemek istediğiniz kişinin adını ve soyadını giriniz");
                String tamAd = input.nextLine();
                System.out.println("Eklemek istediğiniz kişinin adresini giriniz");
                String adres = input.nextLine();
                System.out.println("Eklemek istediğiniz kişinin telefon numarasını giriniz");
                String telefonNumarasi = input.nextLine();


                KimlikPojo kimlikObje = new KimlikPojo(kimlikNumarasi, tamAd, adres, telefonNumarasi);
                kimlikListesi.put(kimlikNumarasi, kimlikObje);
                System.out.println(kimlikListesi);

                System.out.println("Bilgilerini verdiğiniz kişi başarıyla eklenmiştir.\n" +
                        "Kişi eklemeye devam etmek için 1 'e basiniz\n" +
                        "Anasayfaya dönmek için 2' basınız\n" +
                        "Çıkmak için herhangi bir tuşa basınız");


                String secim = input.nextLine();
                if (secim.equals("1")) {
                    saveInfo();
                } else if (secim.equals("2")) {
                    KimlikAnasayfa.selectOption();
                } else {
                    cikis();
                }

            }
        } else {
            System.out.println("Yanlış kimlik numarası girdiniz");
            saveInfo();
        }

    }

    public static void getInfo() throws InterruptedException {
        System.out.println("----------# KİŞİ ARAMA SAYFASI #----------");
        System.out.println("Aramak istediğiniz kişinin kimlik numarasını giriniz");
        String arananKimlik = input.nextLine();

        // if (arananKimlik.matches("[0-9]{4}")) {
        if (kimlikNumaralari.contains(arananKimlik)) {
            KimlikPojo kimlik = kimlikListesi.get(arananKimlik);
            System.out.println(kimlik);
            System.out.println("Kişi aramaya devam etmek için 1 'e basiniz\n" +

                    "Anasayfaya dönmek için 2' basınız\n" +
                    "Çıkmak için herhangi bir tuşa basınız");

            String secim = input.nextLine();
            if (secim.equals("1")) {
                getInfo();
            } else if (secim.equals("2")) {
                KimlikAnasayfa.selectOption();
            } else {
                cikis();
            }
            //    }
        } else {
            System.out.println("Böyle bir kimlik numarası yoktur.");
            getInfo();
        }

    }

    public static void removeInfo() throws InterruptedException {
        System.out.println("----------# KİŞİ SİLME SAYFASI #----------");
        System.out.println("Silmek istediğiniz kişinin kimlik numarasını giriniz");
        String silinecekKimlik = input.nextLine();

        //    if (silinecekKimlik.matches("[0-9]{4}")) {
        if (kimlikNumaralari.contains(silinecekKimlik)) {
            System.out.println(kimlikListesi.get(silinecekKimlik));
            kimlikListesi.remove(silinecekKimlik);
            System.out.println(kimlikListesi);
            System.out.println("İstediğiniz kişi başarıyla silindi\n" +
                    "Kişi silmeye devam etmek için 1 'e basiniz\n" +
                    "Anasayfaya dönmek için 2' basınız\n" +
                    "Çıkmak için herhangi bir tuşa basınız");


            String secim = input.nextLine();
            if (secim.equals("1")) {
                removeInfo();
            } else if (secim.equals("2")) {
                KimlikAnasayfa.selectOption();
            } else {
                cikis();
            }
            //    }
        } else {
            System.out.println("Böyle bir kimlik numarası yoktur.");
            removeInfo();
        }


    }


    static void cikis() throws InterruptedException {
        System.out.println(" Sayfadan çıkış yapılıyor...");
        Thread.sleep(2000);
        System.exit(0);

    }

}