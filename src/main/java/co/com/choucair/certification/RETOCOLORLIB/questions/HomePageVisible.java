package co.com.choucair.certification.RETOCOLORLIB.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static co.com.choucair.certification.RETOCOLORLIB.userinterfaces.HomePage.*;

public class HomePageVisible implements Question<Boolean>{

    @Override
    public Boolean answeredBy(Actor actor) {

        return the(HOME).answeredBy(actor).isCurrentlyVisible();
    }

    public static Question<Boolean> isVisible() {
        return new HomePageVisible();
    }
}