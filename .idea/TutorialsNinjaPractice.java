package MentoringAhmet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinjaPractice {
    public static void main(String[] args) {

        //TASK:

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        WebElement firstNameBox=driver.findElement(By.id("input-firstname"));
        firstNameBox.sendKeys("Alex");

        WebElement lastNameBox=driver.findElement(By.id("input-lastname"));
        lastNameBox.sendKeys("Black");

        WebElement emailBox=driver.findElement(By.id("input-email"));
        emailBox.sendKeys("alex241@gmail.com");

        WebElement phone= driver.findElement(By.id("input-telephone"));
        phone.sendKeys("5555555555");

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("123123123a");

        WebElement confirmPassword= driver.findElement(By.id("input-confirm"));
        confirmPassword.sendKeys("123123123a");

        WebElement subscription=driver.findElement(By.name("newsletter"));
        subscription.click();

        WebElement box=driver.findElement(By.name("agree"));
        box.click();

        WebElement continueBotton= driver.findElement(By.className("btn-primary"));
        continueBotton.click();







    }
}
