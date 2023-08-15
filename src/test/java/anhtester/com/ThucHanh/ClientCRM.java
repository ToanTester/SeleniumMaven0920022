package anhtester.com.ThucHanh;

import anhtester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ClientCRM extends BaseTest {

    public static void loginCRM() {
        driver.get("https://rise.fairsketch.com/signin");
        sleep(2);
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        sleep(1);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@demo.com");
        sleep(1);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
    }

    //Open Client page
    public static void openClientpage(){
        sleep(2);
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='page-content']//a[normalize-space()='Clients']")).click();
        sleep(2);
    }


    //Enter data on Add Client dialog
    public static void enterDataAddClient(String clientName){
        driver.findElement(By.xpath("//a[normalize-space()='Add client']")).click();
        sleep(2);
        driver.findElement(By.xpath(" //input[@id='company_name']")).sendKeys(clientName);
        sleep(2 );
        driver.findElement(By.xpath("//div[@id='s2id_created_by']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys( "Sara Ann", Keys.ENTER);
        sleep(2);
        driver.findElement(By.id("address")).sendKeys("123,abc");
        sleep(1);
        driver.findElement(By.id("city")).sendKeys("Thành Phồ Hồ Chí Minh");
        //Cuộn chuột tới Lable cuối popup
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']")));
        sleep(2);

        driver.findElement(By.id("zip")).sendKeys("test zip");
        driver.findElement(By.id("country")).sendKeys("test country");
        driver.findElement(By.id("phone")).sendKeys("0901667399");
        driver.findElement(By.id("website")).sendKeys("Vuthao.com");
        driver.findElement(By.id("vat_number")).sendKeys("10%");
        driver.findElement(By.id("gst_number")).sendKeys("test number");

        sleep(2);
        driver.findElement(By.xpath(" //button[normalize-space()='Save']")).click();
    }

    public static void checkClientAfferAdded(String clientName){
        sleep(2);
        driver.findElement(By.xpath("//div[@id='client-table_filter']//input")).sendKeys(clientName);
        sleep(2);
        String clientNameInTable = driver.findElement(By.xpath("//table[@id='client-table']//tbody//tr[1]/td[2]")).getText();
        System.out.println("Tên đúng là: " + clientNameInTable);

    }

    public static void main(String[] args) {
        CreateDriver();
        loginCRM();
        openClientpage();
        enterDataAddClient("CarpTech");
        checkClientAfferAdded("CarpTech");

        sleep(1);
        closeDriver();
    }
}
