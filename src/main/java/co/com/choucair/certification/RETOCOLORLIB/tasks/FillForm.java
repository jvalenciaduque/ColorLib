package co.com.choucair.certification.RETOCOLORLIB.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.util.List;
import static co.com.choucair.certification.RETOCOLORLIB.userinterfaces.FormBlockValidation.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillForm implements Task {

    private DataTable datatable;
    WebDriver driver;

    public FillForm(DataTable datatable, WebDriver driver) {
        this.datatable = datatable;
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        JavascriptExecutor js = ((JavascriptExecutor)driver);


        List<String> data = datatable.row(1);
        String required = data.get(0);
        String email = data.get(1);
        String password = data.get(2);
        String cPassword = data.get(3);
        String date = data.get(4);
        String url = data.get(5);
        String digits = data.get(6);
        String range = data.get(7);

        actor.attemptsTo(Click.on(DATE));
        js.executeScript("arguments[0].value = arguments[1];", DATE.resolveFor(actor), "02/02/20204");
        //js.executeScript("arguments[0].setAttribute('value','"+ date +"');", driver.findElement(By.xpath(fecha)));

        actor.attemptsTo(Enter.theValue(required).into(REQUIRED),
                Enter.theValue(email).into(EMAIL),
                Enter.theValue(password).into(PASSWORD),
                Enter.theValue(cPassword).into(CONFIRMPASSWORD),
                Enter.theValue(url).into(URL),
                Enter.theValue(digits).into(DIGITS),
                Enter.theValue(range).into(RANGE)
        );
    }

    public static FillForm with(DataTable datatable, WebDriver driver) {
        return instrumented(FillForm.class, datatable, driver);
    }
}
