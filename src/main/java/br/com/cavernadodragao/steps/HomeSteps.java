package br.com.cavernadodragao.steps;

import br.com.cavernadodragao.components.HomeComponent;
import br.com.cavernadodragao.questions.HomeQuestions;
import br.com.cavernadodragao.utils.GlobalDriver;
import br.com.cavernadodragao.utils.helpers.Wait;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class HomeSteps {

    private final WebDriver webDriver;
    private HomeComponent homeComponent;
    private HomeQuestions homeQuestions;
    private Wait wait;

    public HomeSteps(WebDriver web) {
        this.webDriver = web;
    }

    public HomeSteps() throws Exception {
        webDriver = GlobalDriver.getDriver();
        homeComponent = new HomeComponent(webDriver);
        homeQuestions = new HomeQuestions();
        wait = new Wait(webDriver);
    }

    @Dado("que {string} acessa a aplicação da Caverna do Dragão")
    public void queAcessaAAplicaçãoDaCavernaDoDragão(String playerName) throws Exception {
        homeComponent.startApplication();
        wait.waitForElement(homeComponent.title);
        homeQuestions.hasDisplayedElement(homeComponent.title);
    }

    @Quando("ele informa um nome")
    public void eleInformaUmNome(String playerName) throws Exception {
        homeComponent.informThePlayerName(playerName);
    }

    @E("clica em jogar")
    public void clicaEmJogar() throws Exception{
        homeComponent.clickInTheElement(homeComponent.playButton);
    }

    @Então("ele deve visualizar a primeira página do Quiz")
    public void eleDeveVisualizarAPrimeiraPáginaDoQuiz() throws Exception{
        homeQuestions.hasNotDisplayedElement(homeComponent.title);
    }
}
