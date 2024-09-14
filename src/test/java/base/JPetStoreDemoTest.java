package base;
import Pages.*;
import org.testng.annotations.Test;

public class JPetStoreDemoTest extends BaseTests{

    @Test
    public void testJPetStore_Demo_Test(){
      HomePage homePage= new HomePage(driver);
      FishPage fishPage = homePage.ClickFishLink();
      fishPage.ClickTigerSharkProductID();
      TigerSharkPage tigerSharkPage=new TigerSharkPage(driver);
      tigerSharkPage.ClickAddtoCartBtn();
      tigerSharkPage.scrollToMiddleExcludingHeaderFooter();
      tigerSharkPage.takeScreenshot("ShoppingCartSS");
      ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
      shoppingCartPage.ClickProccedToCheckOutBtn();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.ClickLoginBtn();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage(driver);
        paymentDetailsPage.ClickContinueBtn();
        ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage(driver);
        confirmOrderPage.ClickConfirmBtn();
        confirmOrderPage.scrollToMiddleExcludingHeaderFooter();
        confirmOrderPage.takeScreenshot("confirmorderSS");







    }

    }


