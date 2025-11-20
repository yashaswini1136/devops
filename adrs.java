package address;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", 
            "C:\\Users\\yashu\\OneDrive\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the desired URL
        driver.get("http://www.youtube.com");

        // Execute JavaScript and capture the returned message
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String message = (String) js.executeScript("return document.title;");

        // Print the message to the console
        System.out.println(message);

        // Close the browser
        driver.quit();
    }
}
