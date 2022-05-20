package au.com.carsguide.steps;

import au.com.carsguide.pages.FeaturePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeaturePageTest {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new FeaturePage().carsgudepage();
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new FeaturePage().setMousehoveronbuyandsell();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new FeaturePage().clickonsearchcars();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
    }

    @And("^I select make “<make>”$")
    public void iSelectMakeMake() {
    }

    @And("^I select model “<model>”$")
    public void iSelectModelModel() {
    }

    @And("^I select location “<location>”$")
    public void iSelectLocationLocation() {
    }

    @And("^I select price “<price>”$")
    public void iSelectPricePrice() {
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
    }

    @Then("^I should see the make “<make>” in results$")
    public void iShouldSeeTheMakeMakeInResults() {
    }
}
