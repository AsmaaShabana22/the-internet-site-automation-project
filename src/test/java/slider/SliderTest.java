package slider;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTest extends BaseTest {

    @Test
    public void testSliderToWholeNumber() {
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlide();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
    }
}
