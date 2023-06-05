package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {

    public SelenideElement inventoryList = $(byClassName("inventory_list"));

    public SelenideElement burgerMenu = $(byId("react-burger-menu-btn"));

    public SelenideElement backpackAddToCartButton = $(byId("add-to-cart-sauce-labs-backpack"));

    public SelenideElement cartIcon = $(byId("shopping_cart_container"));



}
