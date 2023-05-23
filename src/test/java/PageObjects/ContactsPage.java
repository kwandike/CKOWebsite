package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage {

    @FindBy  (id = "name")
    private WebElement contactFormName;

    @FindBy (id = "email")
    private WebElement contactFormEmail;
    @FindBy (id = "message")
    private WebElement contactFormMessage;

    //f*ck that css guy who forced me to use bad xpath for this particular button
    @FindBy (xpath = "//*[@id='contacts_form']/div[4]/div/div/button")
    private WebElement submitContactForm;

    @FindBy (xpath = "//header[@class='header']//a[@href='/kontakti']")
    private WebElement btnContacts;

    @FindBy (xpath = "//span[contains(@class, 'error_name')]//span[contains(@class, 'error')]")
    private WebElement nameErrMsg;

    @FindBy (xpath = "//span[contains(@class, 'error_email')]//span[contains(@class, 'error')]")
    private WebElement emailErrMsg;

    //METHODS
    public  ContactsPage(){
        driver.get("https://cleverkids.com.ua/kontakti");
        PageFactory.initElements(driver, this);
    }

    public String getNameErrMsg(){
        return nameErrMsg.getText();
    }

    public String getEmailErrMsg(){
        return emailErrMsg.getText();
    }

    public ContactsPage fillContactForm(String nameValue, String emailValue, String messageValue){
        contactFormName.sendKeys(nameValue);
        contactFormEmail.sendKeys(emailValue);
        contactFormMessage.sendKeys(messageValue);
        //click is temporary commented until
        //submitContactForm.click();
        return this;
    }

    public ContactsPage fillNamelessContactForm(String emailValue){
        contactFormEmail.sendKeys(emailValue);
        submitContactForm.click();
        //temporary insidePageObject assert till I figure out how to call getNameErrMsg from test class
        //Assert.assertEquals("Це поле є обов'язковим для заповнення.", getNameErrMsg());
        return this;
    }

    public ContactsPage fillEmaillessContactForm(String nameValue){
        contactFormName.sendKeys(nameValue);
        submitContactForm.click();
        //temporary insidePageObject assert till I figure out how to call getEmailErrMsg from test class
        //Assert.assertEquals("Це поле є обов'язковим для заповнення.", getEmailErrMsg());
        return this;
    }


}
