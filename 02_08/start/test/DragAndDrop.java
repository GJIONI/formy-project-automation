import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        //create the variable to store the value we want to test-drag
        WebElement drag = driver.findElement(By.id("image"));

        //create the variable to store the value we want to test-drop
        WebElement drop = driver.findElement(By.id("box"));

        //now we need to drag and drop!!!
        //first create an instance of the Actions() class(method)-remember this takes driver as argument
        Actions dAd = new Actions(driver);

        //Thread.sleep(3000);
        //instead of using Thread.sleep(3000miliseconds), we can use the implicit wait command
        //the TimeUnit class will be included here-import it
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //here we add the action to be executed to our elements
        //and we build it and perform it in the same line of codes
        dAd.dragAndDrop(drag, drop).build().perform();

        Thread.sleep(3000);

        //quit the driver
        driver.quit();
    }
}

