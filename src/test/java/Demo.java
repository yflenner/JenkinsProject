import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo
{
    @Test
    public void Test01()
    {
        System.out.println("Hello Jenkins Project, How are You Today ?");
        System.out.println("Job Executed By Yoni");
    }

    @Test
    public void Test02()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println("Title of WebPage is: " + driver.getTitle());
        System.out.println("URL of WebPage is: " + driver.getCurrentUrl());
        driver.quit();
    }
}
