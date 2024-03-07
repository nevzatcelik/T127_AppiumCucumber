package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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















   public void ilkEkranAyarlamalari() throws InterruptedException {
       for (int i=0; i<6; i++){
           ResuableMethods.scrollScreenMethod(946,1005,750,150,1005,500);

       }
       ResuableMethods.scrollWithUiScrollable("Giriş Yap");
   }

}
