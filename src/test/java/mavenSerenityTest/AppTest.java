package mavenSerenityTest;

import mavenSerenityTest.steps.WikipediaTester;
import mavenSerenityTest.ui.LanguageToShorthand;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
public class AppTest {

    @Steps
    WikipediaTester wikipediaTester;

    @Managed
    WebDriver driver;

    @Test
    public void ShouldSeeEnglishTextOnEnglishSite(){

        System.setProperty("webdriver.gecko.driver", "/Users/danfeoktistov/Downloads/geckodriver");
        driver = new FirefoxDriver();

        LanguageToShorthand languageOptions = new LanguageToShorthand();

        // GIVEN
        wikipediaTester.visitsWikipediaHomePage();

        // WHEN
        wikipediaTester.selectsLanguageOption(languageOptions.shorthandOf("English"));

        // THEN
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        wikipediaTester.seesCorrespondingPage(languageOptions.welcomeMessageIn("English"));
        driver.close();
        driver.quit();
    }

    // Commented out as follows are two further tests that demonstrate the ease of use provided by the class used to store metadata about each language's corresponding Wikipedia page.


    /*
        @Test
        public void ShouldSeePolishTextOnPolishSite(){
            System.setProperty("webdriver.gecko.driver", "/Users/danfeoktistov/Downloads/geckodriver");
            driver = new FirefoxDriver();

            LanguageToShorthand languageOptions = new LanguageToShorthand();

            // GIVEN
            wikipediaTester.visitsWikipediaHomePage();

            // WHEN
            wikipediaTester.selectsLanguageOption(languageOptions.shorthandOf("Polish"));

            // THEN
            wikipediaTester.seesCorrespondingPage(languageOptions.welcomeMessageIn("Polish"));
            driver.close();
            driver.quit();
        }

        @Test
        public void ShouldNotSeeItalianTextOnEnglishSite(){
            System.setProperty("webdriver.gecko.driver", "/Users/danfeoktistov/Downloads/geckodriver");
            driver = new FirefoxDriver();

            LanguageToShorthand languageOptions = new LanguageToShorthand();

            // GIVEN
            wikipediaTester.visitsWikipediaHomePage();

            // WHEN
            wikipediaTester.selectsLanguageOption(languageOptions.shorthandOf("English"));

            // THEN
            wikipediaTester.seesMismatchedPage(languageOptions.welcomeMessageIn("Italian"));
            driver.close();
            driver.quit();
        }
    */
}
