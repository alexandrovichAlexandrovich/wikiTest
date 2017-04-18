Notes: Sometimes, this test may fail 

Prerequisite software (up to date):

    - Maven
    - Firefox
    - Gecko Driver (Firefox web driver)
    - Java

Download instructions (Mac OS):
    
    In terminal, navigate to the directory to which you would like to download this project. Initialize git and use the command git clone https://github.com/daniilFeoktistov/wikiTest.git

Usage instructions:

    1. In AppTest.java, set the second parameter of System.setProperty() within each @Test case to the path of your Gecko driver installation.
    2. In Terminal, navigate to the root directory of the project (<path>/wikiTest) and run mvn

Overview:

    This test uses Maven to load Serenity, Selenium, and JUnit in order to test that links on Wikipedia's home page direct to the proper language.

     LanguageToShorthand is a simple implementation of a Hashtable storing metadata for each language on Wikipedia's page:
        1. A language's corresponding two-letter URL prefix (i.e. "English" -> "en")
        2. "Welcome" translated to a given language (i.e. "Italian" -> "Benvenuti")
        
