package Tests;

import PageObjects.ContactsPage;
import PageObjects.MainPage;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainPageTests extends BaseTest {


    @Test
    public void loadMainPage(){
        MainPage mainPage = new MainPage();
        String pageTitle = driver.getTitle();
        Assert.assertEquals("Приватний дитячий садок в Києві ✓ Clever Kids Оболонь", pageTitle);
    };

    @Test
    public void validApplicationIsCreated(){
        String name = "Application Form Test" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String phone = "508888888";
        MainPage mainPage = new MainPage();
        mainPage.sendApplicationFromBody(name, phone);
    }

    @Test
    public void validContactsRequestIsCreated(){
        String name = Helpers.UniqueIdentifier.getUniqueId("Contact Form Test ");
        String email = "contact_form_ck@mailinator.com";
        String message = "Just making sure everything is working fine with some Selenium autotests. No big deal...";
        MainPage mainPage = new MainPage();
        mainPage.openContactsPage().fillContactForm(name, email,message);
        //needs assert to check whether request gets to destination.
        //needs assert to check if sender gets a copy of request to own email.
    }
}
