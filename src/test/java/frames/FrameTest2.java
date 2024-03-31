package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest2 extends BaseTest {

    @Test
    public void testWysiwyg() {
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text = "Hello ";
        editorPage.setTextArea(text);

        assertEquals(editorPage.getTextFromEditor(), text, "Text from editor is incorrect");
    }
}
