package br.com.cavernadodragao.components;

import br.com.cavernadodragao.actions.QuizActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuizComponents extends QuizActions {

    public WebDriver webDriver;

    public QuizComponents(WebDriver web) throws Exception {
        this.webDriver = web;
        PageFactory.initElements(web, this);
    }

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 1 de 15')]")
    @CacheLookup
    WebElement question1;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 2 de 15')]")
    @CacheLookup
    WebElement question2;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 3 de 15')]")
    @CacheLookup
    WebElement question3;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 4 de 15')]")
    @CacheLookup
    WebElement question4;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 5 de 15')]")
    @CacheLookup
    WebElement question5;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 6 de 15')]")
    @CacheLookup
    WebElement question6;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 7 de 15')]")
    @CacheLookup
    WebElement question7;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 8 de 15')]")
    @CacheLookup
    WebElement question8;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 9 de 15')]")
    @CacheLookup
    WebElement question9;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 10 de 15')]")
    @CacheLookup
    WebElement question10;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 11 de 15')]")
    @CacheLookup
    WebElement question11;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 12 de 15')]")
    @CacheLookup
    WebElement question12;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 13 de 15')]")
    @CacheLookup
    WebElement question13;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 14 de 15')]")
    @CacheLookup
    WebElement question14;

    @FindBy(xpath = "//h3[contains(text(), 'Pergunta 15 de 15')]")
    @CacheLookup
    WebElement question15;

    @FindBy(xpath = "//label[contains(text(), 'um jogo de RPG chamado Dungeons and Dragons')]")
    @CacheLookup
    WebElement answer1;

    @FindBy(xpath = "//label[contains(text(), 'Hank, Bobby, Eric, Presto, Sheila e Diana')]")
    @CacheLookup
    WebElement answer2;

    @FindBy(xpath = "//label[contains(text(), 'Hank')]")
    @CacheLookup
    WebElement answer3;

    @FindBy(xpath = "//label[contains(text(), 'Era a unicórnio que sempre andava ao lado de Bobby')]")
    @CacheLookup
    WebElement answer4;

    @FindBy(xpath = "//label[contains(text(), 'Era o principal antagonista da série. " +
            "Era um feiticeiro maléfico com grandes habilidades místicas.')]")
    @CacheLookup
    WebElement answer5;

    @FindBy(xpath = "//label[contains(text(), 'Nenhum dos protagonistas principais empunhava uma espada')]")
    @CacheLookup
    WebElement answer6;

    @FindBy(xpath = "//label[contains(text(), 'Era a acrobata e possuia um bastão mágico como arma')]")
    @CacheLookup
    WebElement answer7;

    @FindBy(xpath = "//label[contains(text(), 'Era uma das antagonistas da série. " +
            "Era uma Deusa Dragoa de cinco cabeças e guardiã do cemitério dos dragões')]")
    @CacheLookup
    WebElement answer8;

    @FindBy(xpath = "//label[contains(text(), 'Era a irmã mais velha do Bobby e usava uma capa da invisibilidade')]")
    @CacheLookup
    WebElement answer9;

    @FindBy(xpath = "//label[contains(text(), 'Era um poderoso mago e guia para os protagonistas, " +
            "lhes dando armas no início da aventura e tentando ajudá-los a voltar para casa')]")
    @CacheLookup
    WebElement answer10;

    @FindBy(xpath = "//label[contains(text(), 'Eric, Diana, Bobby e Presto')]")
    @CacheLookup
    WebElement answer11;

    @FindBy(xpath = "//label[contains(text(), '27 episódios e 3 temporadas')]")
    @CacheLookup
    WebElement answer12;

    @FindBy(xpath = "//label[contains(text(), 'Entraram em um portal que apareceu durante o passeio na montanha russa')]")
    @CacheLookup
    WebElement answer13;

    @FindBy(xpath = "//label[contains(text(), 'Em 1986')]")
    @CacheLookup
    WebElement answer14;

    @FindBy(xpath = "//label[contains(text(), 'Vingador')]")
    @CacheLookup
    WebElement answer15;

    @FindBy(xpath = "//button[contains(text(), 'Confirmar')]")
    @CacheLookup
    WebElement confirmButton;

    @FindBy(xpath = "//form[contains(@class, 'AlternativesForm')]")
    @CacheLookup
    WebElement forms;
}
