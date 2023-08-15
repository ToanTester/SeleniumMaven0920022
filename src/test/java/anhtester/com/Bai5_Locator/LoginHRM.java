package anhtester.com.Bai5_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginHRM {
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
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[1]/input")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/button")).click();

        Thread.sleep(2000);
        //Tắt browser
        driver.quit();
    }
}
