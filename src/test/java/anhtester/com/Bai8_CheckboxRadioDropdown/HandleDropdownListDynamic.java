package anhtester.com.Bai8_CheckboxRadioDropdown;

import anhtester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class HandleDropdownListDynamic extends BaseTest {

    public static void main(String[] args) {
        CreateDriver();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        sleep(3);
        //Click vào Dropdown list category
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        sleep(2);
        //Search giá trị cần chọn.
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Hotels");
        sleep(2);
        //click chon5 Text đã search.(cần chọn).
       // driver.findElement(By.xpath("//li[@class='active-result highlighted']")).click();
        Actions action = new Actions( driver);
        action.sendKeys(Keys.ENTER).perform();//Cách ENTER dùng cho TH chỉ hiển thị 1 gi trị lựa chọn.







        sleep(2);
        closeDriver();
    }
}
