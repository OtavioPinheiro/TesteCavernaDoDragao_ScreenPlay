package br.com.cavernadodragao.actions;

import br.com.cavernadodragao.components.ResultComponents;
import br.com.cavernadodragao.utils.GlobalDriver;
import org.openqa.selenium.WebDriver;

public class ResultActions extends CommonActions {

    private final WebDriver webDriver = GlobalDriver.getDriver();
    ResultComponents resultComponents;

    public ResultActions() throws Exception {
    }
}
