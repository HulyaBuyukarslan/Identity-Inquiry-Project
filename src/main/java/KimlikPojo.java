public class KimlikPojo {
    // kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu

    private String kimlikNo;
    public String tamAd;
    private String adres;
    private String telefon;


    public KimlikPojo() {

    }

    public KimlikPojo(String kimlikNo, String tamAd, String adres, String telefon) {
        this.kimlikNo = kimlikNo;
        this.tamAd = tamAd;
        this.adres = adres;
        this.telefon = telefon;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getTamAd() {
        return tamAd;
    }

    public void setTamAd(String tamAd) {
        this.tamAd = tamAd;
    }

    public String getAdres() {
        return adres;
    }


    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


    @Override
    public String toString() {
        return
                "kimlikNo= " + kimlikNo + ',' +
                "tamAd= " + tamAd + ',' +
                "adres= " + adres + ',' +
                "telefon= " + telefon ;

    }

}

