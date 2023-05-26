package steps;

import cucumber.api.java.en.And;

public class InventorySteps extends BaseSteps{
    @And("^I click on burger menu$")
    public void iClickOnBurgerMenu() {
        inventoryPage.burgerMenu.click();
    }
}
