package anhtester.com.Bai7_WebDriver;

import anhtester.com.Common.BaseTest;
import org.openqa.selenium.WindowType;

public class BasicBrowser extends BaseTest {
    public static void main(String[] args) {
        CreateDriver();
        driver.get("https://anhtester.com");

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://google.com");
        sleep(2);

        driver.get("https://anhtester.com");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://google.com");
        sleep(2);
        closeDriver();
    }
}
