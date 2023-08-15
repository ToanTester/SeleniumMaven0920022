package anhtester.com.Bai7_WebDriver;

import anhtester.com.Common.BaseTest;
import org.openqa.selenium.devtools.v85.network.model.Cookie;

public class InterfaceOptions extends BaseTest {
    public static void main(String[] args) {
        CreateDriver();
        driver.get("https://anhtester.com");

//        driver.manage().addCookie(newCookie);

        closeDriver();


    }
}
