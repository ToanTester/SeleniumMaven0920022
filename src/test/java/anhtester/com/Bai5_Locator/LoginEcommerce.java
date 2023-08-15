package anhtester.com.Bai5_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginEcommerce {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang anhtester.com
        driver.get("https://cms.anhtester.com/login");
        Thread.sleep(1000);
        // Điền email tìm theo id với By.id()
        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        // Điền pass tìm theo name với By.name()
        driver.findElement(By.name("password")).sendKeys("123456");

        // Click Link Forgot password - với y.linkText()
        driver.findElement(By.linkText("Forgot password ?")).click();


        Thread.sleep(2000);
        //Tắt browser
        driver.quit();
    }
}
