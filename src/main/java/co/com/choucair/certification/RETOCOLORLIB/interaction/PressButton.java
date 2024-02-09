package co.com.choucair.certification.RETOCOLORLIB.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PressButton  implements Task {

    private Target button;

    public PressButton(Target button) {
        this.button = button;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(button)
        );
    }

    public static PressButton with(Target button) {
        return instrumented(PressButton.class, button);
    }
}
