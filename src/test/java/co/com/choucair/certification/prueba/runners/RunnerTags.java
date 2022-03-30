package co.com.choucair.certification.prueba.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//Nota la version de chromedriver que use es la 97
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/crearusuario.feature",
        tags="@stories",
        glue="co.com.choucair.certification.prueba.stepdefinitions",
        snippets=SnippetType.CAMELCASE)
public class RunnerTags {
}
