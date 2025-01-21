package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmployee {

    public static WebDriver driver;

    @When("user enters valid login username and password")
    public void user_enters_valid_login_username_and_password() {

        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        usernameField.sendKeys("Admin");
        passwordField.sendKeys("Hum@nhrm123");

    }
    @When("user clicks on login option")
    public void user_clicks_on_login_button() {
        WebElement loginBtnField = driver.findElement(By.id("btnLogin"));
        loginBtnField.click();
    }
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        pimOption.click();
    }
    @When("user clicks on Add Employee button")
    public void user_clicks_on_add_employee_button() {
        WebElement addEmp = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmp.click();
    }
    @When("user enters firstName middleName and lastName of the Employee")
    public void user_enters_first_name_middle_name_and_last_name_of_the_employee() {
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement middleName = driver.findElement(By.id("middleName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        firstName.sendKeys("Hashmat");
        middleName.sendKeys("Samsor");
        lastName.sendKeys("Sayar");
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        WebElement saveBtn = driver.findElement(By.id("btnSave"));
        saveBtn.click();
    }
    @Then("user is able to successfully add the Employee")
    public void user_is_able_to_successfully_add_the_employee() {
        System.out.println("Employee added");
    }


}
