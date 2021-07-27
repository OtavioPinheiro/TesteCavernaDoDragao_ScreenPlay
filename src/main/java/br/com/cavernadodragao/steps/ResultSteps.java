package br.com.cavernadodragao.steps;

import br.com.cavernadodragao.components.ResultComponents;
import br.com.cavernadodragao.questions.ResultQuestions;
import br.com.cavernadodragao.utils.GlobalDriver;
import br.com.cavernadodragao.utils.helpers.Wait;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ResultSteps {

    private final WebDriver webDriver;
    private ResultComponents resultComponents;
    private ResultQuestions resultQuestions;
    private Wait wait;

    public ResultSteps (WebDriver web) {
        this.webDriver = web;
    }

    public ResultSteps () throws Exception{
        webDriver = GlobalDriver.getDriver();
        resultComponents = new ResultComponents(webDriver);
        resultQuestions = new ResultQuestions();
        wait = new Wait(webDriver);
    }

    @Quando("ele estiver na pagina de resultados")
    public void eleEstiverNaPaginaDeResultados() throws Exception {
        resultQuestions.hasDisplayedElement(resultComponents.widgetContent);
    }

    @Entao("verificar se o título {string} está presente na tela")
    public void verificarSeOTítuloEstáPresenteNaTela(String title) throws Exception {
        wait.waitForElement(resultComponents.resultPainelTitle);
        resultQuestions.hasDisplayedElement(resultComponents.resultPainelTitle);
        Assert.assertEquals(title, resultComponents.resultPainelTitle.getText());
    }

    @E("clicar na seta para voltar para página inicial")
    public void clicarNaSetaParaVoltarParaPáginaInicial() throws Exception {
        wait.waitForElement(resultComponents.backLinkArrow);
        resultQuestions.hasDisplayedElement(resultComponents.backLinkArrow);
        resultComponents.clickInTheElement(resultComponents.backLinkArrow);
        wait.waitSeconds(3);
    }
}
