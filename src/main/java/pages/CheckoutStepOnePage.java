package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutStepOnePage {

    public SelenideElement firstNameInputField = $(byId("first-name"));

    public SelenideElement lastNameInputField = $(byId("last-name"));

    public SelenideElement zipCodeInputField = $(byId("postal-code"));

    public SelenideElement continueButton = $(byId("continue"));



}
