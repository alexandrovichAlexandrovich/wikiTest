package mavenSerenityTest.ui;


import java.util.Hashtable;

public class LanguageToShorthand {
    Hashtable<String, String> languageOptions;
    Hashtable<String, String> welcomeMessages;

    public LanguageToShorthand(){
        languageOptions = new Hashtable<String, String>();
        languageOptions.put("English", "en");
        languageOptions.put("Polish", "pl");
        languageOptions.put("Italian", "it");

        welcomeMessages= new Hashtable<String, String>();
        welcomeMessages.put("English", "Welcome");
        welcomeMessages.put("Polish", "Witaj");
        welcomeMessages.put("Italian", "Benvenuti");

    }

    public String shorthandOf(String languageName){
        return this.languageOptions.get(languageName);
    }

    public String welcomeMessageIn(String languageName){
        return this.welcomeMessages.get(languageName);
    }
}
