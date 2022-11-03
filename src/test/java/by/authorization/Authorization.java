package by.authorization;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authorization extends TestData {
    private By signIN = By.xpath("//a[text()='Your Account']");
    private By loginBtn = By.xpath("//h2[contains(text(),'Login')]");
    private By mailInput = By.xpath("//input[@name ='email']");
    private By passwordInput = By.xpath("//input[@name ='password']");
    private By infoMessage = By.xpath("//*[contains(text(),'Important Message!')]");

    @Test
    public void authorization(){
        WebDriver driver = new ChromeDriver();
        driver.get(getUrl);
        driver.findElement(signIN).click();
        driver.findElement(loginBtn).click();
        driver.findElement(mailInput).sendKeys(email, Keys.ENTER);
        driver.findElement(passwordInput).sendKeys(password, Keys.ENTER);
        Assert.assertEquals("Important Message!",driver.findElement(infoMessage).getText());
        driver.quit();
    }

}
