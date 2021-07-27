package br.com.cavernadodragao.actions;

import br.com.cavernadodragao.components.QuizComponents;
import br.com.cavernadodragao.utils.GlobalDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class QuizActions extends CommonActions{

    private final WebDriver web = GlobalDriver.getDriver();
    QuizComponents quizComponents;

    public QuizActions() throws Exception {
    }

    public void answerQuestionsFromTheQuiz(WebElement questionElement) throws Exception {
        for (int i = 0; i < 15; i++) {
            if (questionElement == quizComponents.getQuestionsList().get(i)) {
                quizComponents.getAnswersList().get(i).click();
            }
        }
    }
}
