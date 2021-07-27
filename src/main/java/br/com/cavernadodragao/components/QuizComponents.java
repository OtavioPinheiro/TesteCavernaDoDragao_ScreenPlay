package br.com.cavernadodragao.components;

import br.com.cavernadodragao.actions.QuizActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class QuizComponents extends QuizActions {

    public WebDriver webDriver;

    public QuizComponents(WebDriver web) throws Exception {
        this.webDriver = web;
        PageFactory.initElements(web, this);
    }

    public List<WebElement> getQuestionsList() {
        List<WebElement> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);
        questions.add(question11);
        questions.add(question12);
        questions.add(question13);
        questions.add(question14);
        questions.add(question15);
        return questions;
    }

    public List<WebElement> getAnswersList() {
        List<WebElement> answers = new ArrayList<>();
        answers.add(answer1);
        answers.add(answer2);
        answers.add(answer3);
        answers.add(answer4);
        answers.add(answer5);
        answers.add(answer6);
        answers.add(answer7);
        answers.add(answer8);
        answers.add(answer9);
        answers.add(answer10);
        answers.add(answer11);
        answers.add(answer12);
        answers.add(answer13);
        answers.add(answer14);
        answers.add(answer15);
        return answers;
    }

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 1 de 15')]")
    @CacheLookup
    public WebElement question1;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 2 de 15')]")
    @CacheLookup
    public WebElement question2;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 3 de 15')]")
    @CacheLookup
    public WebElement question3;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 4 de 15')]")
    @CacheLookup
    public WebElement question4;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 5 de 15')]")
    @CacheLookup
    public WebElement question5;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 6 de 15')]")
    @CacheLookup
    public WebElement question6;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 7 de 15')]")
    @CacheLookup
    public WebElement question7;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 8 de 15')]")
    @CacheLookup
    public WebElement question8;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 9 de 15')]")
    @CacheLookup
    public WebElement question9;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 10 de 15')]")
    @CacheLookup
    public WebElement question10;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 11 de 15')]")
    @CacheLookup
    public WebElement question11;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 12 de 15')]")
    @CacheLookup
    public WebElement question12;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 13 de 15')]")
    @CacheLookup
    public WebElement question13;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 14 de 15')]")
    @CacheLookup
    public WebElement question14;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 15 de 15')]")
    @CacheLookup
    public WebElement question15;

    @FindBy(xpath = "//label[contains(text(), 'um jogo de RPG chamado Dungeons and Dragons')]")
    @CacheLookup
    public WebElement answer1;

    @FindBy(xpath = "//label[contains(text(), 'Hank, Bobby, Eric, Presto, Sheila e Diana')]")
    @CacheLookup
    public WebElement answer2;

    @FindBy(xpath = "//label[contains(text(), 'Hank')]")
    @CacheLookup
    public WebElement answer3;

    @FindBy(xpath = "//label[contains(text(), 'Era a unicórnio que sempre andava ao lado de Bobby')]")
    @CacheLookup
    public WebElement answer4;

    @FindBy(xpath = "//label[contains(text(), 'Era o principal antagonista da série. " +
            "Era um feiticeiro maléfico com grandes habilidades místicas.')]")
    @CacheLookup
    public WebElement answer5;

    @FindBy(xpath = "//label[contains(text(), 'Nenhum dos protagonistas principais empunhava uma espada')]")
    @CacheLookup
    public WebElement answer6;

    @FindBy(xpath = "//label[contains(text(), 'Era a acrobata e possuia um bastão mágico como arma')]")
    @CacheLookup
    public WebElement answer7;

    @FindBy(xpath = "//label[contains(text(), 'Era uma das antagonistas da série. " +
            "Era uma Deusa Dragoa de cinco cabeças e guardiã do cemitério dos dragões')]")
    @CacheLookup
    public WebElement answer8;

    @FindBy(xpath = "//label[contains(text(), 'Era a irmã mais velha do Bobby e usava uma capa da invisibilidade')]")
    @CacheLookup
    public WebElement answer9;

    @FindBy(xpath = "//label[contains(text(), 'Era um poderoso mago e guia para os protagonistas, " +
            "lhes dando armas no início da aventura e tentando ajudá-los a voltar para casa')]")
    @CacheLookup
    public WebElement answer10;

    @FindBy(xpath = "//label[contains(text(), 'Eric, Diana, Bobby e Presto')]")
    @CacheLookup
    public WebElement answer11;

    @FindBy(xpath = "//label[contains(text(), '27 episódios e 3 temporadas')]")
    @CacheLookup
    public WebElement answer12;

    @FindBy(xpath = "//label[contains(text(), 'Entraram em um portal que apareceu durante o passeio na montanha russa')]")
    @CacheLookup
    public WebElement answer13;

    @FindBy(xpath = "//label[contains(text(), 'Em 1986')]")
    @CacheLookup
    public WebElement answer14;

    @FindBy(xpath = "//label[contains(text(), 'Vingador')]")
    @CacheLookup
    public WebElement answer15;

    @FindBy(xpath = "//button[contains(text(), 'Confirmar')]")
    @CacheLookup
    public WebElement confirmButton;

    @FindBy(xpath = "//form[contains(@class, 'AlternativesForm')]")
    @CacheLookup
    public WebElement forms;
}
