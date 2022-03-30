package co.com.choucair.certification.prueba.questions;

import co.com.choucair.certification.prueba.model.information;
import co.com.choucair.certification.prueba.userinterface.enterfields;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {
private String question;
    private  List<information> d;

    public Answer(String questions) {
        this.question = questions;
    }

    public static Answer toThe(String question) {


        return new Answer(question) ;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;

        String button = Text.of(enterfields.submit).viewedBy(actor).asString();
        result = d.get(0).getButton().equals(button)?true:false;
        return result;
    }
    }



