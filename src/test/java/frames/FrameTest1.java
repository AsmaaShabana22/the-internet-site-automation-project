package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest1 extends BaseTest {

    @Test
    public void testFrameText() {
        var nestedFramePage = homePage.clickFrames().clickNestedFrames();
        assertEquals(nestedFramePage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramePage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
    }
}
