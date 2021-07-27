package br.com.cavernadodragao.steps;

import br.com.cavernadodragao.actions.QuizActions;
import br.com.cavernadodragao.components.QuizComponents;
import br.com.cavernadodragao.questions.QuizQuestions;
import br.com.cavernadodragao.utils.GlobalDriver;
import br.com.cavernadodragao.utils.helpers.Wait;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
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
    public void queOTituloPerguntaEstejaNaTela(String questionNum, String question) throws Exception {
        int num = Integer.parseInt(questionNum);
        wait.waitForElement(quizComponents.getQuestionsList().get(num));
        quizQuestions.hasDisplayedElement(quizComponents.getQuestionsList().get(num));
        Assert.assertEquals(question, quizComponents.getQuestionsList().get(num).getText());
    }

    @Entao("clicar na alternativa {string} correta da pergunta {string}")
    public void clicarNaAlternativaCorretaDaPergunta(String answer, String questionNum) {
        int num = Integer.parseInt(questionNum);
        Assert.assertEquals(answer, quizComponents.getAnswersList().get(num).getText());
        quizComponents.getAnswersList().get(num).click();
    }

    @E("clicar em {string}")
    public void clicarEm(String confirm) throws Exception {
        Assert.assertEquals(confirm, quizComponents.confirmButton.getText());
        quizComponents.clickInTheElement(quizComponents.confirmButton);
    }
}
