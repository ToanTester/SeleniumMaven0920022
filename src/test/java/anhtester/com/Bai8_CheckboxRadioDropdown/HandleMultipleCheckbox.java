package anhtester.com.Bai8_CheckboxRadioDropdown;

import anhtester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleMultipleCheckbox extends BaseTest {
    public static void main(String[] args) {
        CreateDriver();

        //<Kiểm tra checkbox mặc định.
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        List<WebElement> ListCheckbox = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
        System.out.println(ListCheckbox.size());

        for (int i = 1; i<= ListCheckbox.size(); i++){
            sleep(1);
            driver.findElement(By.xpath("//label[normalize-space()='Option "+i+"']")).click();
        }

        for (int i = 1; i <= ListCheckbox.size(); i++){
            sleep(1);
            boolean isSelected = driver.findElement(By.xpath("//label[normalize-space()='Option "+i+"']/input")).isSelected();
            System.out.println("Kiểm tra trạng thái duyệt vòng for: "+ isSelected);
        }

        sleep(2);
        closeDriver();
    }
}
