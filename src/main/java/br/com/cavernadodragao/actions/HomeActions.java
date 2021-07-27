package br.com.cavernadodragao.actions;

import br.com.cavernadodragao.components.HomeComponents;
import br.com.cavernadodragao.utils.GlobalDriver;
import org.openqa.selenium.WebDriver;

public class HomeActions extends CommonActions{

    private final WebDriver web = GlobalDriver.getDriver();
    HomeComponents homeComponents;

    public HomeActions() throws Exception {
    }

    public void informThePlayerName(String playerName) throws Exception {
        homeComponents = new HomeComponents(web);
        homeComponents.nameField.sendKeys(playerName);
    }
}