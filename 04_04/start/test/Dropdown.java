import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        //define the webelement for the dropdowmenu
        WebElement dropDownElement = driver.findElement(By.id("dropdownMenuButton"));

        //click on the dropdownmenu
        dropDownElement.click();

        Thread.sleep(3000);
        //select an item menu by defining it-here we find it by linkText, which is the text that a link contains not the href
        WebElement checkbox = driver.findElement(By.linkText("Checkbox"));

        Thread.sleep(3000);
        //and then click on it
        checkbox.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
