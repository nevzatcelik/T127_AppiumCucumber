package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import pages.HesabimPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ResuableMethods;

public class aileButcem {
    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();
    AileButcemPage aileButcemPage=new AileButcemPage();
    HesabimPage hesabimPage=new HesabimPage();

    @Given("ilk ekran ayarlarini yapin {int} {int} {int} {int} {int} {int} {int} {int} ve ardindan login {string} sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(int for1,int forSart,int x1,int y1,int wait,int x2,int y2,int bekleme,String girisText) throws InterruptedException {
      // 946,1005 waitAction  150,1005
       aileButcemPage.ilkEkranOrtakAdimlari(for1,forSart,x1,y1,wait,x2,y2,bekleme,girisText);
    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string} giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail,String sifre,String girisYap) {
      aileButcemPage.emailBox.sendKeys(ConfigReader.getProperty(mail));
      aileButcemPage.passwordBox.sendKeys(ConfigReader.getProperty(sifre));
      ResuableMethods.scrollWithUiScrollable(girisYap);
    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        Assert.assertTrue(aileButcemPage.girisYapildiText.isDisplayed());
    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(String hesabim) throws InterruptedException {
     aileButcemPage.ucCizgiTiklamaMethodu();
     ResuableMethods.scrollWithUiScrollable(hesabim);

    }
    @Given("hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {string} {string} degisikleri kaydedin ve dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin(String isim,String soyisim,String sehir,String yas,String meslek) {
      hesabimPage.textBoxVeriGirme(ConfigReader.getProperty(isim),ConfigReader.getProperty(soyisim),ConfigReader.getProperty(sehir),ConfigReader.getProperty(yas),ConfigReader.getProperty(meslek));
      hesabimPage.textBoxKontrol(ConfigReader.getProperty(isim),ConfigReader.getProperty(soyisim),ConfigReader.getProperty(sehir),ConfigReader.getProperty(yas),ConfigReader.getProperty(meslek));
    }
    @Given("kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {
        Driver.quitAppiumDriver();
    }


    @Given("anasayfadaki arti {int} {int} {int} butonuna tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin(int x,int y,int bekleme) throws InterruptedException {
     ResuableMethods.koordinatTiklamaMethodu(x,y,bekleme);
    }
    @Given("{string} bolumune tiklayin")
    public void gelir_ekle_bolumune_tiklayin(String gelirText) {
    ResuableMethods.scrollWithUiScrollable(gelirText);
    }

    @Given("Gelir Ekle sayfasinda aciklama kismina {string} deger girilir")
    public void gelir_ekle_sayfasinda_aciklama_kismina_deger_girilir(String ilkKutu) {
        aileButcemPage.aciklamaKutusu.sendKeys(ilkKutu);
    }
    @Given("Gelir Ekle sayfasinda {string} Gelir tipi {string} secilir")
    public void gelir_ekle_sayfasinda_gelir_tipi_secilir(String gelirTipiButonu,String GelirTipi) {
        ResuableMethods.scrollWithUiScrollable(gelirTipiButonu);
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable(GelirTipi);
    }
    @Given("Gelir Ekle sayfasinda {string} Kategori {string} secilir")
    public void gelir_ekle_sayfasinda_kategori_secilir(String kategori,String kategoriTuru) {
        ResuableMethods.scrollWithUiScrollable(kategori);
        ResuableMethods.wait(1);
        ResuableMethods.scrollWithUiScrollable(kategoriTuru);
        ResuableMethods.wait(1);


    }
    @Given("Gelir Ekle sayfasinda Tarih belirlemesi yapilir")
    public void gelir_ekle_sayfasinda_tarih_belirlemesi_yapilir() throws InterruptedException {
      // aileButcemPage.tarihKutusu.click(); // 409,1246


    }
    @Given("Gelir Ekle sayfasinda Tutar bilgisi girilir")
    public void gelir_ekle_sayfasinda_tutar_bilgisi_girilir() {

    }
    @Given("Kaydet Butonuna Tiklanir")
    public void kaydet_butonuna_tiklanir() {

    }

    @Given("Gelir Ekle bolumunde {string},{string},{string},{string} {string},{int} {int} tarih ve tutari belirleyin ve kaydedin")
    public void aciklama_gelir_tip_kategori_tarih_ve_tutari_belirleyin_ve_kaydedin(String ilkKutu,String gelirTip) {




    }
    @Given("basariyla eklendigini dogrulayin")
    public void basariyla_eklendigini_dogrulayin() {


    }



}
