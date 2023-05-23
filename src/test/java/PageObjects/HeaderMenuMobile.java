package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderMenuMobile extends BasePage {

    //ABOUT US
    @FindBy (xpath = "//header[@class='header']//a[@href='/pro-nas']")
    private WebElement btnAboutUs;

    public void ClickAboutUs(){btnAboutUs.click();}

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

    public HeaderMenuMobile(){
        PageFactory.initElements(driver, this);
    }

}