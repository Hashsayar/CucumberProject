package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class EmployeeLogin {
public static WebDriver driver;

    @Given("user navigates the HRMs application")
    public void user_navigates_the_hr_ms_application() {
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @When("user does not enter valid user name")
    public void user_does_not_enter_valid_user_name() {
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.clear();

    }
    @When("user does not enter valid password")
    public void user_does_not_enter_valid_password() {
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.clear();

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();
    }
    @Then("user sees an error massage")
    public void user_sees_an_error_massage() {
        WebElement errorMsg = driver.findElement(By.id("spanMessage"));
        String errorText = errorMsg.getText();
        String expectedMassage = "Username cannot be empty";
        assertEquals(expectedMassage, errorText);
        System.out.println(expectedMassage);
    }

}
