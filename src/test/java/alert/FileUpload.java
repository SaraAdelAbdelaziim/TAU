package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import static org.testng.Assert.*;

public class FileUpload extends BaseTests {

    @Test
    public void UploadFileTest(){
        FileUploadPage uploadFile = homepage.OpenFileUploadPage();
        //we pass the file path as a string tpo the uploader window
        uploadFile.UploadFile("C:\\Users\\Sara\\IdeaProjects\\TAu\\resources\\chromedriver.exe");
        String file = "chromedriver.exe";
        assertEquals(uploadFile.GetUploadedFile(),file,"File not uploaded!");
    }
}
