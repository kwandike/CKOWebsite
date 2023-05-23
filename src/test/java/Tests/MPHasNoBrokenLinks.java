package Tests;

import PageObjects.MainPage;
import org.junit.Test;
import io.restassured.RestAssured;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

    public class MPHasNoBrokenLinks extends BaseTest{

        int statusCode;

        public int getResponseCode(String url) {
            return RestAssured.get(url).statusCode();
        }

        @Test
        public void checkBrokenLinks() {
            MainPage mainPage = new MainPage();

            //Get all the links on the page and put them in a list
            List<WebElement> links = driver.findElements(By.cssSelector("a"));

            String href;

            //go through every link and get its response code then print it out
            for(WebElement link : links) {
                href = link.getAttribute("href");
                statusCode = new MPHasNoBrokenLinks().getResponseCode(href);

                if(200 != statusCode) {
                    System.out.println(href + " gave a response code of " + statusCode);

                }
            }
        }

}
