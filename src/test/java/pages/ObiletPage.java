package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;
import utils.Driver;

import java.time.Duration;

public class ObiletPage {

    public ObiletPage(){
        PageFactory.initElements(new AppiumFieldDecorator(BrowserDriver.getBrowserDriver(), Duration.ofSeconds(15)), this);

    }


    @FindBy(xpath = "//button[@aria-label='Menü']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[@class='language']")
    public WebElement languageButton;
}
