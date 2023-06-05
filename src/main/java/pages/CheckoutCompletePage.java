package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutCompletePage {

    public SelenideElement header = $(byClassName("complete-header"));

    public SelenideElement secondaryHeader = $(byClassName("header_secondary_container"));
}
