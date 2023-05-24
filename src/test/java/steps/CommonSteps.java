package steps;


import cucumber.api.java.en.Then;

import static com.codeborne.selenide.Condition.*;

public class CommonSteps extends BaseSteps{
    @Then("^I am on the page Inventory$")
    public void iAmOnThePageInventory() {
        inventoryPage.inventoryList.shouldBe(visible);
    }
}
