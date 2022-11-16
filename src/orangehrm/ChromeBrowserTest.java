package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    //Creating main method of the class
    public static void main(String[] args) {
        //Declaring string type local variable
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //setting up properties for chrome web driver
System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//creating interface object
        WebDriver driverCd = new ChromeDriver();
        //opening given url
        driverCd.get(baseUrl);
        //maximising window upon opening
        driverCd.manage().window().maximize();
        //time given to driver to wait until page is loaded completely
        driverCd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get and print title page in console
        String title= driverCd.getTitle();
        System.out.println("page title is:"+title);
        //get current url
        System.out.println(("Current URL:"+ driverCd.getCurrentUrl()));
        //get page source
        System.out.println("Page source:"+ driverCd.getPageSource());
        //getting and entering email in email field
        WebElement emailField=driverCd.findElement(By.id("Email"));
        emailField.sendKeys("sp@gmail.com");
        //getting and entering password in password field
        WebElement passwordField =driverCd.findElement(By.name("Password"));
        passwordField.sendKeys("pass_234");

        // Closing the chrome browser
        driverCd.quit();



    }
}
