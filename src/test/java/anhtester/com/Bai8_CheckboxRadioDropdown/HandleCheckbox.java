package anhtester.com.Bai8_CheckboxRadioDropdown;

import anhtester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        CreateDriver();

        //<Kiểm tra checkbox mặc định.
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        WebElement checkboxOne = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean checkboxstatusBefore = checkboxOne.isSelected();
        System.out.println(checkboxstatusBefore);
        sleep(1);

        //  Nếu checkbox chưa chọn (False) thì Click chọn.
        if (checkboxstatusBefore == false)
        {
            checkboxOne.click();
        }
        //Kiểm tra KQ sau khi chọn.
        boolean checkboxstatusAfter = checkboxOne.isSelected();
        System.out.println(checkboxstatusAfter);

        //Kiểm tra thông báo liên quen với Kq khi đã chọn.
       WebElement messege  = driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println("Trạng thái Checkbox sau khi chọn: " + messege.isDisplayed());
        System.out.println(messege.getText());

        sleep(2);
        closeDriver();
    }
}
