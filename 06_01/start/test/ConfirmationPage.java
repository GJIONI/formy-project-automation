import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

    public static void waitForAlertPage(WebDriver driver) throws InterruptedException {
        //we want to check that our test ran successfully, so we should check that the redirection page is the one
        //with the success message
        //EXPLICITLY WAIT to see the message of the redirection page
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //define the element we are waiting for
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

    }



    //this method is not void so add a return statement
    public static String getAlertPageText(WebDriver driver) throws InterruptedException {
        //get the element text .getText() method and store it to a variable
        WebElement alert = driver.findElement(By.className("alert"));
        String alertText = alert.getText();
        System.out.println("this is the expected test: " + alertText);
        //print the text to see that its the same
        return alertText;
    }
}
