import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        //define the choose file field
        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));

        //send keys to the field above so tha you can type the filename of the file you want
        //here its easy since we include the file into the same folder that our test exists
        fileUploadField.sendKeys("file-to-upload.png");
        Thread.sleep(3000);

        //press enter but not in this formy page doesn't work this way
        //fileUploadField.sendKeys(Keys.RETURN);
        //Thread.sleep(3000);

        driver.quit();
    }
}
