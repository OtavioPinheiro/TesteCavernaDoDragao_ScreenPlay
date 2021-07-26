package br.com.cavernadodragao.actions;

import br.com.cavernadodragao.utils.GlobalDriver;
import org.openqa.selenium.WebDriver;

public abstract class CommonActions {
    private final WebDriver web = GlobalDriver.getDriver();

    public CommonActions() throws Exception {}


}