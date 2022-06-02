package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeworkAhmet {

    @Test
    public void validationOfDescendingOrderOptions() throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogButton=driver.findElement(By.id("menu-catalog"));
        catalogButton.click();
        Thread.sleep(2000);

        WebElement options=driver.findElement(By.xpath("//a[.='Options']"));
        options.click();

        WebElement optionNameButton=driver.findElement(By.xpath("//a[.='Option Name']"));
        optionNameButton.click();

        List<WebElement> descendingallOptions=driver.findElements(By.xpath("//tbody/tr//td[2]"));
        List<String> actualDescendingOrder=new ArrayList<>();
        List<String> expectedDescendingOrder=new ArrayList<>();
        for(int i=0;  i<descendingallOptions.size();   i++){
            actualDescendingOrder.add(descendingallOptions.get(i).getText().trim());
            expectedDescendingOrder.add(descendingallOptions.get(i).getText().trim());
            Collections.sort(expectedDescendingOrder);
            Collections.reverse(expectedDescendingOrder);
            Assert.assertEquals(actualDescendingOrder,expectedDescendingOrder);
        }

        System.out.println(expectedDescendingOrder);
        System.out.println(actualDescendingOrder);

    }

}
