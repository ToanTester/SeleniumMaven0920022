package anhtester.com.Bai8_CheckboxRadioDropdown;

import anhtester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) {
        CreateDriver();

        //<Kiểm tra checkbox mặc định.
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        WebElement radiobuttion = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Male']/input"));
        System.out.println( radiobuttion.isSelected());

        if (radiobuttion.isSelected() == false)
        {
            radiobuttion.click();
        }
        System.out.println( radiobuttion.isSelected());
        sleep(1);

        WebElement radio0to15 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='5 to 15']/input"));
        radio0to15.click();

        System.out.println("trang thái radio Group: " + radio0to15.isSelected());
        sleep(1);
        WebElement radio0to5 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='0 to 5']/input"));
        WebElement radio15to50= driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='15 to 50']/input"));

        System.out.println("trang thái radio Group 0 to 5: " +radio0to5.isSelected());
        System.out.println("trang thái radio Group 15 to 50: " +radio15to50.isSelected());


        sleep(2);
        closeDriver();
    }
}
