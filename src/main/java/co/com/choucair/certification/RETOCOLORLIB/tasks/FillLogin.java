package co.com.choucair.certification.RETOCOLORLIB.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.choucair.certification.RETOCOLORLIB.userinterfaces.LoginPage.*;

public class FillLogin implements Task {

    private String user;
    private String password;

    public FillLogin(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(USERFIELD),
                Enter.theValue(password).into(PASSWORDFIELD)
        );
    }

    public static FillLogin with(String user, String password) {
        return instrumented(FillLogin.class, user, password);
    }
}
