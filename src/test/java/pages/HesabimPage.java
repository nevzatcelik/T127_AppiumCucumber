package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ResuableMethods;

import java.time.Duration;

public class HesabimPage {

    public HesabimPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement isimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyisimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement sehirkutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement yaskutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement meslekKutusu;
    public void bilgiSilme(){
        isimKutusu.clear();
        soyisimKutusu.clear();
        sehirkutusu.clear();
        yaskutusu.clear();
        meslekKutusu.clear();
    }

    public void textBoxVeriGirme(String isim,String soyisim,String sehir,String yas,String meslek){
        bilgiSilme();
        isimKutusu.sendKeys(isim);
        soyisimKutusu.sendKeys(soyisim);
        sehirkutusu.sendKeys(sehir);
        yaskutusu.sendKeys(yas);
        meslekKutusu.sendKeys(meslek);
        ResuableMethods.scrollWithUiScrollable("Kaydet");

    }

    public void textBoxKontrol(String isim,String soyisim,String sehir,String yas,String meslek){
        Assert.assertTrue(isimKutusu.getText().contains(isim));
        Assert.assertTrue(soyisimKutusu.getText().contains(soyisim));
        Assert.assertTrue(sehirkutusu.getText().contains(sehir));
        Assert.assertTrue(yaskutusu.getText().contains(yas));
        Assert.assertTrue(meslekKutusu.getText().contains(meslek));
    }

}
