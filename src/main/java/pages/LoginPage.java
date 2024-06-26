package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By userNameField = By.id("username");
    private By passWordField = By.id("password");
    private By loginButton = By.xpath(" //*[@id=\"login\"]/button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String username) {
        driver.findElement(userNameField).sendKeys(username);
    }

    public void setPassWord(String password) {
        driver.findElement(passWordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

}
