package steps;

import pages.*;

public class BaseSteps {
    LoginPage loginPage = new LoginPage();

    InventoryPage inventoryPage = new InventoryPage();

    SideBar sideBar = new SideBar();

    CartPage cartPage = new CartPage();

    CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();

    CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage();

    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
}
