package br.com.cavernadodragao.actions;

import br.com.cavernadodragao.components.HomeComponent;
import br.com.cavernadodragao.utils.GlobalDriver;
import org.openqa.selenium.WebDriver;

public class HomeActions extends CommonActions{

    private final WebDriver web = GlobalDriver.getDriver();
    HomeComponent homeComponent;

    public HomeActions() throws Exception {
    }

    public void informThePlayerName(String playerName) throws Exception {
        homeComponent = new HomeComponent(web);
        homeComponent.nameField.sendKeys(playerName);
    }
}