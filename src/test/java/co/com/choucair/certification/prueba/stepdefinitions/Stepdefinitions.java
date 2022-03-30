package co.com.choucair.certification.prueba.stepdefinitions;


import co.com.choucair.certification.prueba.model.information;
import co.com.choucair.certification.prueba.questions.Answer;
import co.com.choucair.certification.prueba.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class Stepdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("^Manuel wants to access the platform$")
    /// metodo que ejecuta la accion como tal de entrar a la pagina y presionar el boton
    public void manuelWantsToAccessThePlatform()  {
     OnStage.theActorCalled("Manuel").wasAbleTo(OpenUp.thePage());
    }


    @When("^entering the requested data$")
    public void enteringTheRequestedData(List<information> d) {
        OnStage.theActorInTheSpotlight().attemptsTo(register.form(d));


    }

    @Then("^the creation is completed by filling in the data and pressing (.*)$")
    public void theCreationIsCompletedByFillingInTheDataAndPressingTheButtonSubmit(String question) {
      ///  OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }




}
