package br.com.cavernadodragao.questions;

import org.openqa.selenium.WebElement;

public abstract class CommonQuestions {

    public boolean hasDisplayedElement(WebElement element) throws Exception {
        return element.isDisplayed();
    }

//    public boolean hasNotDisplayedElement(WebElement element) throws Exception {
//        return !element.isDisplayed();
//    }
}
