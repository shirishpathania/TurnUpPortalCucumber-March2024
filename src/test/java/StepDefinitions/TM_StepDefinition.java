package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.TM_Page;
import Utilities.CommonDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TM_StepDefinition extends CommonDriver {


    LoginPage loginPageObj = new LoginPage();
    HomePage homePageObj = new HomePage();
    TM_Page tmPageObj = new TM_Page(driver);

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
    @Given("user logs into turnup portal")
    public void userLogsIntoTurnupPortal() throws InterruptedException {

        Thread.sleep(1000);

        // Login page object initialization and definition

        loginPageObj.LoginSteps(driver);

        
    }

    @And("user navigates to TM page")
    public void userNavigatesToTMPage() {

        // Home page object intialization and definition

        homePageObj.GoToTMPage(driver);
        System.out.println("User navigated to TM Page successfully");

        
    }

    @When("user creates a new TM record {string} {string} {string}")
    public void abc(String code, String description, String price) {
        tmPageObj.CreateTimeRecord(driver, "Keyboard", "M","Unknown Material","500");
        System.out.println("User created a TM record successfully");

    }

    @Then("tm record should be created successfully")
    public void tmRecordShouldBeCreatedSuccessfully() {
        tmPageObj.CreateTMAssertion(driver, "Keyboard", "M","Unknown Material","$500.00");
        System.out.println("Verified that new TM record was created successfully");

    }

    @When("I edit an existing Time Material record {string} {string} {string} {string} {string} {string} <newDescription> <newprice>")
    public void iEditAnExistingTimeMaterialRecordOldCodeOldTypeCodeOldDescriptionOldPriceNewCodeNewTypeCodeNewDescriptionNewprice() {
        
    }

    @Then("the record should be updated <newCode>")
    public void theRecordShouldBeUpdatedNewCode() {
    }
}
