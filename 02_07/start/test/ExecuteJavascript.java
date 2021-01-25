import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        //create a variable to store the value of the element we want to test
        WebElement modalOpen = driver.findElement(By.id("modal-button"));

        //click it
        modalOpen.click();
        Thread.sleep(3000);

        //close modal button
        WebElement closeModalButton = driver.findElement(By.id("close-button"));
        Thread.sleep(3000);

        //here we call JavaScript Executor
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        //here we use the JavaScriptExecutor to close the button
        //this is JavaScript used to click the Close button inside the modal
        jse.executeScript("arguments[0].click();", closeModalButton);
        Thread.sleep(3000);

        //click closeModalButton to close the modal
        //closeModalButton.click(); this doesn't work since the WebDriver can't find any elements inside the modal

        driver.quit();
    }
}
