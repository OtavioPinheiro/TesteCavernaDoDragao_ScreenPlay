package br.com.cavernadodragao.questions;

import org.openqa.selenium.WebElement;

public abstract class CommonQuestions {

    public boolean hasDisplayedElement(WebElement element) throws Exception {
        return element.isDisplayed();
    }
}
