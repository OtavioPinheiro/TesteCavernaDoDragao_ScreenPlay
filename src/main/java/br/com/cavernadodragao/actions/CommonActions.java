package br.com.cavernadodragao.actions;

import br.com.cavernadodragao.utils.GlobalDriver;
import br.com.cavernadodragao.utils.helpers.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class CommonActions {
    private final WebDriver web = GlobalDriver.getDriver();
    Wait wait = new Wait(web);

    public CommonActions() throws Exception {
    }

    public void startApplication() throws Exception {
        String url = "https://cavernadodragaoquiz-otaviopinheiro.vercel.app/";
        web.get(url);
        wait.waitSeconds(2);
    }

    public void clickInTheElement(WebElement element) throws Exception {
        wait.waitSeconds(1);
        element.click();
    }

    public void clickInTheElementUntilEnable(WebElement element) throws Exception {
        do {
            wait.waitSeconds(1);
            element.click();
        } while (element.isEnabled());
    }

//    public void closeApplication() throws Exception {
//
//    }
}