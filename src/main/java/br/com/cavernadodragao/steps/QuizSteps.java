package br.com.cavernadodragao.steps;

import br.com.cavernadodragao.actions.QuizActions;
import br.com.cavernadodragao.components.QuizComponents;
import br.com.cavernadodragao.questions.QuizQuestions;
import br.com.cavernadodragao.utils.GlobalDriver;
import br.com.cavernadodragao.utils.helpers.Wait;
import io.cucumber.java.pt.Dado;
import org.openqa.selenium.WebDriver;

public class QuizSteps {

    private final WebDriver webDriver;
    private QuizComponents quizComponents;
    private QuizQuestions quizQuestions;
    private Wait wait;

    public QuizSteps (WebDriver web) {
        this.webDriver = web;
    }

    public QuizSteps() throws Exception {
        webDriver = GlobalDriver.getDriver();
        quizComponents = new QuizComponents(webDriver);
        quizQuestions = new QuizQuestions();
        wait = new Wait(webDriver);
    }

    @Dado("que o titulo {string} {string} esteja na tela")
    public void queOTituloPerguntaEstejaNaTela(String questionNum, String question) {
    }
}
