package mavenSerenityTest.ui;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class LanguageSelectionArea extends PageObject{
    public void chooseLanguage(String languageShorthand){
        String query = "*[lang="+languageShorthand;
        $(query).click();
    }
}
