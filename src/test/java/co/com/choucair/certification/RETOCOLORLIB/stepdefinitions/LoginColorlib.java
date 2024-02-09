package co.com.choucair.certification.RETOCOLORLIB.stepdefinitions;

import co.com.choucair.certification.RETOCOLORLIB.questions.HomePageVisible;
import co.com.choucair.certification.RETOCOLORLIB.tasks.FillLogin;
import co.com.choucair.certification.RETOCOLORLIB.interaction.PressButton;
import static org.hamcrest.core.Is.is;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.RETOCOLORLIB.tasks.OpenTheBrowser;
import co.com.choucair.certification.RETOCOLORLIB.userinterfaces.UrlPagina;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.choucair.certification.RETOCOLORLIB.userinterfaces.LoginPage.*;

public class LoginColorlib {

    UrlPagina urlPagina;

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Deseo realizar logueo en el aplicativo colorlib")
    public void deseoRealizarLogueoEnElAplicativoColorlib() {
        OnStage.theActorCalled("User").wasAbleTo(OpenTheBrowser.on(urlPagina));
    }

    @When("^Ingreso credenciales con (.*) y (.*)")
    public void ingresoCredencialesConDemoYDemo(String userL, String password) {
        OnStage.theActorCalled("User").attemptsTo(FillLogin.with(userL, password));
    }

    @When("Presiono boton SignIn")
    public void presionoBotonSignIn() {
        OnStage.theActorCalled("User").attemptsTo(PressButton.with(LOGINBUTTON));
    }

    @Then("Valido logueo exitoso con label en home")
    public void validoLogueoExitosoConLabelEnHome() {
        OnStage.theActorCalled("User").should(seeThat(HomePageVisible.isVisible(), is(true)));
    }
}
