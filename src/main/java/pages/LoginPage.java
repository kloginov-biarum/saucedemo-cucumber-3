package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement usernameInputField = $(byId("user-name"));

    public SelenideElement passwordInputField = $(byId("password"));

    public SelenideElement loginButton = $(byId("login-button"));

    public SelenideElement errorMessage = $(byTagName("h3"));

}
