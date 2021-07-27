package br.com.cavernadodragao.components;

import br.com.cavernadodragao.actions.ResultActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultComponents extends ResultActions {

    public WebDriver webDriver;

    public ResultComponents(WebDriver web) throws Exception {
        this.webDriver = web;
        PageFactory.initElements(web, this);
    }

    @FindBy(xpath = "//div[contains(@class, 'Widget__Content')]")
    @CacheLookup
    public WebElement widgetContent;

    @FindBy(xpath = "//h3[contains(text(), 'Tela de Resultado:')]")
    @CacheLookup
    public WebElement resultPainelTitle;

    @FindBy(xpath = "//a[contains(@class, 'BackLinkArrow')]")
    @CacheLookup
    public WebElement backLinkArrow;
}
