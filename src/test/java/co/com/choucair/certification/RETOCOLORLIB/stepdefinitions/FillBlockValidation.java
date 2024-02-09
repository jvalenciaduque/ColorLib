package co.com.choucair.certification.RETOCOLORLIB.stepdefinitions;

import co.com.choucair.certification.RETOCOLORLIB.interaction.PressButton;
import co.com.choucair.certification.RETOCOLORLIB.interaction.Scroll;
import co.com.choucair.certification.RETOCOLORLIB.questions.ErrorVisible;
import co.com.choucair.certification.RETOCOLORLIB.tasks.FillForm;
import co.com.choucair.certification.RETOCOLORLIB.userinterfaces.UrlPagina;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.choucair.certification.RETOCOLORLIB.userinterfaces.HomePage.*;
import static co.com.choucair.certification.RETOCOLORLIB.userinterfaces.FormBlockValidation.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

public class FillBlockValidation {

    UrlPagina urlPagina;

    @Given("Deseo realizar el diligenciamiento del formulario")
    public void deseoRealizarElDiligenciamientoDelFormulario() {
        OnStage.theActorCalled("User").attemptsTo(Scroll.to(urlPagina.getDriver()));
    }

    @When("Diligencio todo los campos del formulario")
    public void diligencioTodoLosCamposDelFormulario(DataTable dataTable) {
        OnStage.theActorCalled("User").attemptsTo(FillForm.with(dataTable, urlPagina.getDriver()));
    }

    @When("Presiono boton Validate")
    public void presionoBotonValidate() {
        OnStage.theActorCalled("User").attemptsTo(PressButton.with(POLICY));
        OnStage.theActorCalled("User").attemptsTo(PressButton.with(VALIDATE));
    }

    @Then("Valido diligenciamiento exitoso")
    public void validoDiligenciamientoExitoso() {
        OnStage.theActorCalled("User").should(seeThat(ErrorVisible.isVisible(), is(false)));
    }

    @Then("Valido diligenciamiento fallido")
    public void validoDiligenciamientoFallido() {
        OnStage.theActorCalled("User").should(seeThat(ErrorVisible.isVisible(), is(true)));
    }
}
