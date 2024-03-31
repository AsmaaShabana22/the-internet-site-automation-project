package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIFrameId = "mce_0_ifr";
    private By textArea = By.xpath("//*[@id=\"tinymce\"]");


    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToEditArea() {
        driver.switchTo().frame(editorIFrameId);
    }

    public void clearTextArea() {
        switchToEditArea();

        WebElement inputElement = driver.findElement(textArea);
        inputElement.click();
        inputElement.sendKeys(Keys.CONTROL + "a");
        inputElement.sendKeys(Keys.DELETE);

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(d -> inputElement.isDisplayed());
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditArea();

        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor() {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }
}
