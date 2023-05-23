package PageObjects;

import Properties.ConfigProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(xpath = "//header[@class='header']//a[@href='/pro-nas']")
    private static WebElement btnAboutUs;

    public static void ClickAboutUs(){btnAboutUs.click();}
    @FindBy (xpath = "//header[@class='header']//a[@href='/pro-nas/nasha-ekspertnist']")
    private WebElement btnOurExpertise;

    @FindBy (xpath = "//header[@class='header']//a[@href='/pro-nas/chomu-nas-lyublyat']")
    private WebElement btnWhyLoveUs;

    @FindBy (xpath = "//header[@class='header']//a[@href='/pro-nas/vidguki']")
    private WebElement btnTestimonials;


    //CONDITIONS
    @FindBy (xpath = "//header[@class='header']//a[@href='/umovi']")
    private WebElement btnConditions;

    @FindBy (xpath = "//header[@class='header']//a[@href='/umovi/infrastruktura']")
    private WebElement btnInfrastructure;

    @FindBy (xpath = "//header[@class='header']//a[@href='/umovi/dennij-son']")
    private WebElement btnNoonSleep;

    @FindBy (xpath = "//header[@class='header']//a[@href='/umovi/xarchuvannya']")
    private WebElement btnFood;

    @FindBy (xpath = "//header[@class='header']//a[@href='/umovi/turbota-pro-zdorovya']")
    private WebElement btnHealth;

    @FindBy (xpath = "//header[@class='header']//a[@href='/umovi/turbota-i-povaga']")
    private WebElement btnCareAndRespect;

    @FindBy (xpath = "//header[@class='header']//a[@href='/umovi/navchannya']")
    private WebElement btnStudying;

    @FindBy (xpath = "//header[@class='header']//a[@href='/umovi/avtorska-clever-konczepcziya']")
    private WebElement btnCleverConcept;

    @FindBy (xpath = "//header[@class='header']//a[@href='/umovi/organizacziya-navchannya']")
    private WebElement btnStudyingOrg;


    //SCHOOL
    @FindBy (xpath = "//header[@class='header']//a[@href='/shkola-clever']")
    private WebElement btnSchool;


    //GROUPS AND PRICES
    @FindBy (xpath = "//header[@class='header']//a[@href='/grupi-j-czini']")
    private WebElement btnPrices;

    @FindBy (xpath = "//header[@class='header']//a[@href='/eureka-group']")
    private WebElement btnEureka;

    @FindBy (xpath = "//header[@class='header']//a[@href='/discovery']")
    private WebElement btnDiscovery;

    @FindBy (xpath = "//header[@class='header']//a[@href='/explorer']")
    private WebElement btnExplorer;


    //STUDIOS
    @FindBy (xpath = "//header[@class='header']//a[@href='/stud']")
    private WebElement btnStudios;


    //FOR PARENTS
    @FindBy (xpath = "//header[@class='header']//a[@href='/batkam']")
    private WebElement btnForParents;

    @FindBy (xpath = "//header[@class='header']//a[@href='/myaka-adaptacziya-do-dityachogo-sadka']")
    private WebElement btnAdaptation;

    @FindBy (xpath = "//header[@class='header']//a[@href='/konsultaczii-dlya-batkiv']")
    private WebElement btnParentsConsult;

    @FindBy (xpath = "//header[@class='header']//a[@href='/poshireni-zapitannya']")
    private WebElement btnFAQ;


    //BLOG
    @FindBy (xpath = "//header[@class='header']//a[@href='/blogua']")
    private WebElement btnBlog;


    //Contacts
    @FindBy (xpath = "//header[@class='header']//a[@href='/kontakti']")
    private WebElement btnContacts;


    //Search
    @FindBy (xpath = "//header[@class='header']//a[@href='#']")
    private WebElement btnSearch;

    @FindBy (xpath = "//header[@class='header']//*[contains(@class, 'search_form')]")
    private WebElement inputSearch;


    //Application start points
    @FindBy (xpath = "//section[@class='call-to-action']//a[@data-src='#subscribe_modal']")
    private WebElement applicationBtnBody;

    @FindBy (xpath = "//div[@class='contacts']//a[@data-src='#subscribe_modal']")
    private WebElement applicationBtnContacts;

    @FindBy (xpath = "//div[@class='fixed_phone']//a[@data-src='#subscribe_modal']")
    private WebElement applicationBtnSnippet;


    //Application form elements
    @FindBy (id = "subscribe_name")
    private WebElement applicationName;

    @FindBy (id = "subscribe_phone")
    private WebElement applicationPhone;

    @FindBy (xpath = "//*[@id='subscribe_form']/div[3]/div/div/button")
    private WebElement applicationSubmitBtn;

    @FindBy ()
    private WebElement applicationStatusMsg;

    @FindBy (xpath = "//img[@class='modal_close']")
    private WebElement closeButton;

    // GoTo page url, init Elements
    public  MainPage(){
        driver.get(ConfigProvider.URl);
        PageFactory.initElements(driver, this);
    }



    public MainPage sendApplicationFromBody(String nameValue, String phoneValue){
        applicationBtnBody.click();
        applicationName.sendKeys(nameValue);
        applicationPhone.sendKeys(phoneValue);
        //applicationSubmitBtn.click();
        return this;
    }

    public MainPage closeApplicationForm(){
        closeButton.click();
        return this;
    }

    public ContactsPage openContactsPage(){
        btnContacts.click();
        return new ContactsPage();
    }
}
