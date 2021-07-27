package br.com.cavernadodragao.actions;

import br.com.cavernadodragao.components.QuizComponents;
import br.com.cavernadodragao.utils.GlobalDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuizActions extends CommonActions{

    private final WebDriver web = GlobalDriver.getDriver();
    QuizComponents quizComponents;

    public QuizActions() throws Exception {
    }

    public void answerQuestionsFromTheQuiz(WebElement element) throws Exception {
        quizComponents = new QuizComponents(web);
        quizComponents.clickInTheElement(element);
    }
}