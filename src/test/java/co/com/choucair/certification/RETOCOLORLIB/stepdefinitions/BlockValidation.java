package co.com.choucair.certification.RETOCOLORLIB.stepdefinitions;

import co.com.choucair.certification.RETOCOLORLIB.interaction.PressButton;
import co.com.choucair.certification.RETOCOLORLIB.questions.BlockVisible;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.choucair.certification.RETOCOLORLIB.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

public class BlockValidation {

    @When("Deseo ingresar a Funcionalidad Block Validation")
    public void deseoIngresarAFuncionalidadBlockValidation() {
        OnStage.theActorCalled("User").attemptsTo(PressButton.with(FORMS));
    }
    @When("Doy click en el submenu Form Validation")
    public void doyClickEnElSubmenuFormValidation() {
        OnStage.theActorCalled("User").attemptsTo(PressButton.with(FORMSVALIDATION));
    }
    @Then("Verifico que se presenta pantalla de la funcionalidad con título Block Validation")
    public void verificoQueSePresentaPantallaDeLaFuncionalidadConTítuloBlockValidation() {
        OnStage.theActorCalled("User").should(seeThat(BlockVisible.isVisible(), is(true)));
    }
}
