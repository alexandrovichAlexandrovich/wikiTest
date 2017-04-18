Notes: Sometimes, this test may return as failed on its first run. This is rare, but simply running it a second time fixes the issue.

Prerequisite software (up to date):

    - Apache Maven 3.5 
    - Firefox 52
    - Gecko Driver (Firefox web driver) 0.15.0 (https://github.com/mozilla/geckodriver/releases)
    - JDK 1.8

Download and usage instructions (Mac OS):
    
    1. Once everything has been installed, navigate to the directory to which you would like to download this project. Initialize git and clone the repository.
    
        >> cd <directory>
        >> git init
        >> git clone https://github.com/daniilFeoktistov/wikiTest.git

    2. Open /src/test/java/mavenSerenityTest/AppTest.java. On line 25, set the second parameter of System.setProperty() within each @Test case to the path of your Gecko Driver installation.
    
        System.setProperty("webdriver.gecko.driver", "<directory of Gecko Driver>");
    
    3. In Terminal, navigate to the root directory (wikiTest) of the project. If you just downoaded it, you should already be at its parent directory.
    
        >> cd wikiTest
    
    4. Run Maven.
 
        >> mvn

Overview:

    This test uses Maven to load Serenity, Selenium, and JUnit in order to test that links on Wikipedia's home page direct to the proper language. All it requires for input is the name of the language to be tested-currently supports "English", "Italian", and "Polish".

     LanguageToShorthand is a simple implementation of a Hashtable storing metadata for each language on Wikipedia's page:
        1. A language's corresponding two-letter URL prefix (i.e. "English" -> "en")
        2. "Welcome" translated to a given language (i.e. "Italian" -> "Benvenuti")
        
