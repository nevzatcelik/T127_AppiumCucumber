package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ResuableMethods;

import java.time.Duration;
import java.util.logging.XMLFormatter;

public class AileButcemPage {
   public AileButcemPage(){
       PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);

   }

   @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
   public MobileElement emailBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement passwordBox;

   @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
   public MobileElement girisYapildiText;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement aciklamaKutusu;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement TutarKutusu;

    @FindBy(id = "android:id/button1")
    public MobileElement okButonu;

    @FindBy(xpath = "//*[@text='Gelir eklendi.']")
    public MobileElement gelirEklemeCheck;





  public void ucCizgiTiklamaMethodu() throws InterruptedException {
      ResuableMethods.wait(4);
      ResuableMethods.koordinatTiklamaMethodu(113,135,500);
  }

   public void ilkEkranOrtakAdimlari(int for1,int forSart,int x1,int y1,int wait,int x2,int y2,int bekleme,String girisText) throws InterruptedException {
       ResuableMethods.wait(3);
       for (int i=for1; i<forSart; i++){
           ResuableMethods.scrollScreenMethod(x1,y1,wait,x2,y2,bekleme);

       }
       ResuableMethods.scrollWithUiScrollable(girisText);
   }



   public void ilkEkranAyarlamalari() throws InterruptedException {
       for (int i=0; i<6; i++){
           ResuableMethods.scrollScreenMethod(946,1005,750,150,1005,500);

       }
       ResuableMethods.scrollWithUiScrollable("Giriş Yap");
   }
   public void tarihEkranKaydirmaMethodu(int for1,int forSart,int x1,int y1,int wait,int x2,int y2,int bekleme) throws InterruptedException {
       for (int i = for1; i < forSart; i++) {
           ResuableMethods.scrollScreenMethod(x1, y1, wait, x2, y2, bekleme);

       }
   }

   public void setTarihKutusu() throws InterruptedException {
       ResuableMethods.koordinatTiklamaMethodu(975,1253,1000);

   }

}
