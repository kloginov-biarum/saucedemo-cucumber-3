package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutStepTwoPage {

    public SelenideElement finishButton = $(byId("finish"));

}
