import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        //we are adding methods to use so that our code is more readable
        //we are also adding classes where we include each method to organize our code
        //our methods are 'Static' so we don't need to create an 'Instance' of the class we can use the methods upon the classes themselves
        //1. call the submitForm() method
        FormPage.submitForm(driver);
        Thread.sleep(5000);
        //2. wait for the redirection page to open
        ConfirmationPage.waitForAlertPage(driver);
        //3. check that the text above is the expected one by adding an assertion
        //here I added into the project structure modules the dependency of junit.jar, so that we can import the assertion below
        assertEquals("The form was successfully submitted!", ConfirmationPage.getAlertPageText(driver));

        driver.quit();
    }

}
