import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class FirstTestCase {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","C:\\ENOSIS\\TipTech\\Automation\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("http://192.168.2.52/TipQAWeb/views/login.html");

        WebElement loginid = driver.findElement(By.xpath("//input[@name='name']"));
        loginid.sendKeys("auto");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement password = driver.findElement(By.xpath("//input[@name='word']"));
        password.sendKeys("auto");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement login =driver.findElement(By.id("login"));
        login.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.quit();

    }
}
