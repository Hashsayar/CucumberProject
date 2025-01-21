package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmployee {

    public WebDriver driver;

    @When("user enters valid login username and password")
    public void user_enters_valid_login_username_and_password() {
        WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        userName.sendKeys("admin");
        password.sendKeys("Hum@nhrm123");

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();
    }
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on Add Employee button")
    public void user_clicks_on_add_employee_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters firstName middleName and lastName of the Employee")
    public void user_enters_first_name_middle_name_and_last_name_of_the_employee() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user is able to successfully add the Employee")
    public void user_is_able_to_successfully_add_the_employee() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
