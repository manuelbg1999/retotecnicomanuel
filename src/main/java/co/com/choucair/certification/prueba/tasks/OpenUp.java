package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.userinterface.principalpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
///Clase que se asocia al primer step
//abrir la pagina
public class OpenUp  implements Task{

    private principalpage principalpage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);

    }


    ///metodo que me ejecuta la apertura del navegador
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(principalpage));


    }
}
