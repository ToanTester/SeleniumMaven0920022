package anhtester.com.Bai6_WebElemment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException {
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Login CMS
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        //Bắt WEbElemment (Object)
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("admin@example.com");
        Thread.sleep(1000);

        driver.findElement(By.id("password")).sendKeys("123456");
        Thread.sleep(1000);
        //inputEmail.clear();
        Thread.sleep(1000);

        WebElement checkboxRemember1 = driver.findElement(By.id("remember"));
        System.out.println("Đã chọn lần 1: " + checkboxRemember1.isSelected());
        WebElement tieude = driver.findElement(By.xpath("//div[@class='card-body']//h1"));
        System.out.println("getText tiêu đề login: " + tieude.getText());

        driver.findElement(By.xpath("//span[normalize-space()='Remember Me']")).click();
        WebElement checkboxRemember2 = driver.findElement(By.id("remember"));
        System.out.println("Đã chọn lần 2: " + checkboxRemember2.isSelected());

        WebElement buttioncopy = driver.findElement(By.xpath("//button[normalize-space()='Copy']"));
        System.out.println("Trạng thái nút Copy: " + buttioncopy.isDisplayed());
        WebElement buttonLogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        System.out.println("background-color Login: " + buttonLogin.getCssValue("background-color"));

        if (buttioncopy.isDisplayed() == true) {
//            buttonLogin.click();
            buttonLogin.submit();
        }


        Thread.sleep(2000);
        driver.quit();
    }

}
