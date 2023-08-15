package anhtester.com.Bai8_CheckboxRadioDropdown;

import anhtester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownListStatic extends BaseTest {

    public static void main(String[] args) {
        CreateDriver();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        sleep(5);

        WebElement selecttElement = driver.findElement(By.xpath("//select[@id='select-demo']"));
        //Khởi tạo đối tượng Select và Gán giá trị là 1 WebElement của thẻ <select> trong HTML.
        Select select = new Select(selecttElement);
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("Kiểm tra kiểu của select: " + select.isMultiple());
        System.out.println("Số lượng Options trong select: " + select.getOptions().size());

        //Get option với hàm hỡ trợ của class select.
        select.selectByVisibleText("Wednesday");
        sleep(1);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByValue("Thursday");
        sleep(1);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        sleep(2);
        closeDriver();
    }
}
