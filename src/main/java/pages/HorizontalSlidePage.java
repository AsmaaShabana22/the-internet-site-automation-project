package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlidePage {

    private WebDriver driver;
    private By sliderValue = By.id("range");
    private By slider = By.xpath("//*[@id=\"content\"]/div/div/input");

    public HorizontalSlidePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSliderValue(String value) {
        while (!getSliderValue().equals(value)) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue() {
        return driver.findElement(sliderValue).getText();
    }
}
