package br.com.cavernadodragao.components;

import br.com.cavernadodragao.actions.HomeActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeComponent extends HomeActions {

    public WebDriver webDriver;

    public HomeComponent(WebDriver web) throws Exception {
        this.webDriver = web;
        PageFactory.initElements(web, this);
    }

    @FindBy(xpath = "//h1[contains(text(), 'Quiz da Caverna do Dragão')]")
    @CacheLookup
    public WebElement title;

    @FindBy(xpath = "//input[contains(@placeholder, 'Informe seu nome')]")
    @CacheLookup
    public WebElement nameField;

    @FindBy(xpath = "//button[contains(text(), 'Bora Jogar')]")
    @CacheLookup
    public WebElement playButton;
}
