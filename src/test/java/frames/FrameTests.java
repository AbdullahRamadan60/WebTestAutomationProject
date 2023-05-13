package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EditorPage;

public class FrameTests extends BaseTests
{
    @Test
    public void test()
    {
        EditorPage editorPage = homePage.clickEditorLink();

        editorPage.clearTextArea();
        editorPage.TypeInTextArea("Hello World!!");
        editorPage.clickIncreaseIndentButton();

        Assert.assertEquals(editorPage.getTextFromEditor() , "Hello World!!");
    }

}
