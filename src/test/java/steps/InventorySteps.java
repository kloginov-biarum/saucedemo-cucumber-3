package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class InventorySteps extends BaseSteps{
    @And("^I click on burger menu$")
    public void iClickOnBurgerMenu() {
        inventoryPage.burgerMenu.click();
    }

    @When("^I push add to cart button of backpack$")
    public void iPushAddToCartButtonOfBackpack() {
        inventoryPage.backpackAddToCartButton.click();
    }

    @And("^click on cart icon$")
    public void clickOnCartIcon() {
        inventoryPage.cartIcon.click();
    }
}
