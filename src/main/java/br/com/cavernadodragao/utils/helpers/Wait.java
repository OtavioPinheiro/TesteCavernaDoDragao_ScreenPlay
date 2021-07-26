package br.com.cavernadodragao.utils.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wait {
    WebDriver web;
    String correctElement;
    String correctElementTypeExtracted;

    public Wait(WebDriver web) { this.web = web; }

    private void findByTypeOfElementBasedOnType(WebDriver webDriver, String locatorType, String elementIdentifier, Integer implicitlyWait) {
        WebDriverWait wait = new WebDriverWait(webDriver, implicitlyWait);

        if (locatorType.toLowerCase().contains("xpath")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementIdentifier)));
        }
        switch (locatorType.toLowerCase()) {
            case "id":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementIdentifier)));
                break;
            case "css":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementIdentifier)));
                break;
            case "name":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(elementIdentifier)));
                break;
            case "classname":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(elementIdentifier)));
                break;
            case "linkText":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(elementIdentifier)));
                break;
        }
    }

    private void convertWebElementToString(WebElement element) {
        String elementAsString = element.toString();
        String elementNameExtracted = elementAsString.replaceAll("(.*\\:\\s)", "");
        String elementNameWithoutExtraChars = elementNameExtracted.substring(0, elementNameExtracted.length() - 1);
        correctElement = elementNameWithoutExtraChars.substring(1);

        Pattern pattern = Pattern.compile(".+?(\\$.*\\:).+");
        Matcher matcher = pattern.matcher(elementAsString);
        if (matcher.matches()) {
            System.out.println(matcher.group(1));
        }
        String elementTypeUnformatted = matcher.group(1);
        correctElementTypeExtracted = elementTypeUnformatted.substring(1).substring(0, elementTypeUnformatted.length() - 2);
        System.out.println(correctElementTypeExtracted);
    }

    public void waitForElement(WebElement element) {
        int implicitlyWait = 50;
        convertWebElementToString(element);
        findByTypeOfElementBasedOnType(web, correctElementTypeExtracted, correctElement, implicitlyWait);
    }
}
