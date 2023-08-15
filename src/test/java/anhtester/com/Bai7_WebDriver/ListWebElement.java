package anhtester.com.Bai7_WebDriver;

import anhtester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListWebElement extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        CreateDriver();

        driver.get("https://demo.activeitzone.com/ecommerce/login");
        sleep(1);
        driver.findElement(By.xpath("//button[normalize-space()='Copy']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        sleep(2);

        List<WebElement> listMenu  = driver.findElements(By.xpath("//ul[@id='main-menu']/li"));
        for (int i = 0 ; i < listMenu.size(); i++ ){
            System.out.println(listMenu.get(i).getText());

        }

        closeDriver();

    }
}
