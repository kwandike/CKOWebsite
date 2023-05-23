package Tests;

import PageObjects.ContactsPage;
import org.junit.Assert;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContactsPageTests extends BaseTest {


    @Test
    public void validContactRequestIsCreated(){
        String name = Helpers.UniqueIdentifier.getUniqueId("Contact Form Test ");
        String email = "contact_form_ck@mailinator.com";
        String message = "Just making sure everything is working fine with some Selenium autotests. No big deal...";
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.fillContactForm(name, email, message);
    }

    @Test
    public void noNameRequestThrowsErrMsg(){
        String email = "contact_form_ck@mailinator.com";
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.fillNamelessContactForm(email);
        Assert.assertEquals("Це поле є обов'язковим для заповнення.", contactsPage.getNameErrMsg());
    }

    @Test
    public void noEmailRequestThrowsErrMsg(){
        String name = Helpers.UniqueIdentifier.getUniqueId("Contact Form Test ");
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.fillEmaillessContactForm(name).getEmailErrMsg();
        Assert.assertEquals("Це поле є обов'язковим для заповнення.", contactsPage.getEmailErrMsg());
    }
}
