package co.com.choucair.certification.RETOCOLORLIB.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.choucair.certification.RETOCOLORLIB.userinterfaces.FormBlockValidation.ISREQUIRED;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ErrorVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return the(ISREQUIRED).answeredBy(actor).isCurrentlyVisible();
    }

    public static Question<Boolean> isVisible() {
        return new ErrorVisible();
    }
}
