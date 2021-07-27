package br.com.cavernadodragao.actions;

import br.com.cavernadodragao.utils.GlobalDriver;
import br.com.cavernadodragao.utils.helpers.Wait;
import org.openqa.selenium.WebDriver;

public abstract class CommonActions {
    private final WebDriver web = GlobalDriver.getDriver();

    public CommonActions() throws Exception {

    }

    public void startApplication() throws Exception {
        String url = "https://cavernadodragaoquiz-otaviopinheiro.vercel.app/";
        Wait wait = new Wait(web);
        web.get(url);
        wait.wait(3_000);
    }
}