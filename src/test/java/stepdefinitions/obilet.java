package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ObiletPage;
import utils.BrowserDriver;
import utils.ResuableMethods;

public class obilet {
   ObiletPage obiletPage=new ObiletPage();
    @Given("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String url) {
        BrowserDriver.getBrowserDriver().get(url);
    }
  @Given("Sag ust koseden menu hamburgerine tiklanir")
  public void sag_ust_koseden_menu_hamburgerine_tiklanir() {
        obiletPage.menuButton.click();
   }
    @Given("dil olarak turkce secilir")
    public void dil_olarak_turkce_secilir() {
       obiletPage.languageButton.click();
       obiletPage.turkisLanguage.click();
    }
    @Given("para birimi olarak tl secilir")
    public void para_birimi_olarak_tl_secilir() {
        obiletPage.currencySelect.click();
        obiletPage.turkishLira.click();
    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() {
        obiletPage.searchButton.click();
    }
    @Given("gelen bilet fiyatlarinin {string} oldugu dogrulanir")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulanir(String paraPirimi) {
        ResuableMethods.wait(5);
        Assert.assertTrue(obiletPage.priceTypeResult.getText().contains(paraPirimi));
    }

    @Given("kullanic browser i kapatir")
    public void kullanic_browser_i_kapatir() {
      BrowserDriver.quitAppiumDriver();
    }

}
