package co.com.choucair.certification.prueba.tasks;


import co.com.choucair.certification.prueba.model.information;
import co.com.choucair.certification.prueba.userinterface.enterfields;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.List;

public class register implements Task {


    private  List<information> d;
    public register(List<information> d){
        this.d=d;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(d.get(0).getFirstname()).into(enterfields.firstname),
                Enter.theValue(d.get(0).getLastname()).into(enterfields.lastname),
                Enter.theValue(d.get(0).getAddress()).into(enterfields.address),
                Enter.theValue(d.get(0).getEmail()).into(enterfields.email),
                Enter.theValue(d.get(0).getPhone()).into(enterfields.phone),
                Click.on(enterfields.gender),
                Click.on(enterfields.hobbies),
                Click.on(enterfields.languages),
                Click.on(enterfields.languages2),
                Click.on(enterfields.div),
                Click.on(enterfields.skills),
                Click.on(enterfields.country),
                Enter.theValue(d.get(0).getCountry()).into(enterfields.country2),
                Hit.the(Keys.ARROW_DOWN).into(enterfields.country2),
                Hit.the(Keys.ENTER).into(enterfields.country2),
                SendKeys.of(d.get(0).getYear()).into(enterfields.year),
                SendKeys.of(d.get(0).getMonth()).into(enterfields.month),
                SendKeys.of(d.get(0).getDay()).into(enterfields.day),
                SendKeys.of(d.get(0).getPass()).into(enterfields.pass),
                SendKeys.of(d.get(0).getRpass()).into(enterfields.rpass),
                Click.on(enterfields.submit));

    }
    public static register form(List<information> d) {
        return Tasks.instrumented(register.class,d);

    }

}
