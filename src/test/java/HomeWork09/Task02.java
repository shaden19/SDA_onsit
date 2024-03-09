package HomeWork09;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class Task02 extends TestBase  {

    @Test
    public void test(){

        // Get the path for the desktop directory
        String desktopPath = System.getProperty("user.home") + "/Desktop/";
        String filePath = desktopPath + "test_file.txt";
        // Create a new file
        File file = new File(filePath);

        try {
            // Create the file on the desktop
            boolean isFileCreated = file.createNewFile();

            // Verify that the file is created successfully
            Assert.assertTrue(isFileCreated);

            // Check if the file exists
            boolean fileExists = file.exists();

            // Verify that the file exists
            Assert.assertTrue(fileExists);
        } catch (IOException e) {
            e.printStackTrace();
        }


}

}