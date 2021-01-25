import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {
        //here we are using the chrome driver we have downloaded for our test, we are saying intellij where to find it
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\chromedriver\\chromedriver.exe");

        //here we are defining an Instance of the ChromeDriver() object-instantiating the chrome driver
        //the chrome driver class is instantiated onto the browser with the WebDriver Class
        //it uses the org.openqa.selenium.chrome.ChromeDriver we import above
        WebDriver driver = new ChromeDriver();

        //here we(the Selenium webdriver) are sending a request to the driver to navigate to the URL specified
        //it uses the org.openqa.selenium.WebDriver we import above
        //driver.get() one of the WebDriver Object's method
        driver.get("https://formy-project.herokuapp.com/keypress");

        //define the element we are searching in the page to test
        //this uses the org.openqa.selenium.WebElement we import above
        //driver.findElement here By.id("")
        WebElement name = driver.findElement(By.id("name"));

        //click into the input field to focus in it
        name.click();

        //type smth in the element below, since is an input field
        name.sendKeys("Hello!!!");

        //find the button
        WebElement button = driver.findElement(By.id("button"));

        //click the button
        button.click();

        //quit the driver
        driver.quit();
    }
}
