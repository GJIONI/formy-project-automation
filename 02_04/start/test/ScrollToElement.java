import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        //define the downloaded driver, import1
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\chromedriver\\chromedriver.exe");

        //create an instance of the chromedriver object import2
        WebDriver driver = new ChromeDriver();

        //launch the browser and navigate to page
        driver.get("https://formy-project.herokuapp.com/scroll");

        //define the element you want-driver find
        WebElement name = driver.findElement(By.id("name"));

        //type the name
        name.sendKeys("Anne");

        //include the Actions class from selenium so that we can use the scroll page action
        //we should import it
        //here we create an instance of the class
        Actions actions = new Actions(driver);

        //here we declare the moveToElement() method of the Actions class
        //inside the parenthesis we define the name of the element where we want to move to
        actions.moveToElement(name);

        //add the other field next to name field-date
        WebElement date = driver.findElement(By.id("date"));

        //set the date
        date.sendKeys("01/01/2021");

        // need time to watch
        Thread.sleep(5000);


        driver.quit();
    }
}
