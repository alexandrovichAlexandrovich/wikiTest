package mavenSerenityTest.steps;


import mavenSerenityTest.ui.CurrentPage;
import mavenSerenityTest.ui.HomePage;
import mavenSerenityTest.ui.LanguageSelectionArea;
import mavenSerenityTest.ui.LanguageToShorthand;
import net.thucydides.core.annotations.Step;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class WikipediaTester {

    HomePage wikiHomePage;
    LanguageSelectionArea languageSelectionArea;
    CurrentPage currentPage;

    @Step
    public void visitsWikipediaHomePage() {
        wikiHomePage.open();
    }

    @Step
    public void selectsLanguageOption(String languageShorthand){
        languageSelectionArea.chooseLanguage(languageShorthand);
    }

    @Step
    public void seesCorrespondingPage(String welcomeMessage) {
        assertTrue(currentPage.containsText(welcomeMessage));
    }

    @Step
    public void seesMismatchedPage(String welcomeMessage) {
        assertFalse(currentPage.containsText(welcomeMessage));
    }
}
