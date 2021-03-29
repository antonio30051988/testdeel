import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testAuto {

	public static void main (String[] arg){
        WebDriver driver = new ChromeDriver();

        driver.get("https://dev.deel.wtf/")
        boolean statusTest = false;
        var User = driver.findElement(By.Name("user")).sendKeys("usern");
        var pass = driver.findElement(By.Name("password")).sendKeys("passwordn");
        var buttomS = driver.findElement(By.Name("submit")).click();

        /* User data */
        // Test cases with user if everything is OK StatusTest = true  
        statusTest = string.matches("Regex to review the data");

        // Create a fuction with every case in test cases to be reusable

        if (statusTest){
            system.out.println("Success");
        }else{
            system.out.println("False" + error);
        }
	}
}