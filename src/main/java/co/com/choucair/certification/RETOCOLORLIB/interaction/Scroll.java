package co.com.choucair.certification.RETOCOLORLIB.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.AccionesWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Scroll implements Task {
    private WebDriver driver;

    AccionesWeb accionesWeb;

    public Scroll(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)");

        accionesWeb.esperaImplicita(5);
    }

    public static Scroll to(WebDriver driver) {
        return instrumented(Scroll.class, driver);
    }
}
