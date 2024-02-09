package co.com.choucair.certification.RETOCOLORLIB.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target HOME = Target.the("home")
            .located(By.xpath("//*[@id=\"top\"]/header/div[2]/h3/i"));

    public static final Target FORMS = Target.the("forms")
            .located(By.xpath("//*[@id=\"menu\"]/li[6]/a"));

    public static final Target FORMSVALIDATION = Target.the("formsValidation")
            .located(By.xpath("//*[@id=\"menu\"]/li[6]/ul/li[2]/a"));

    public static final Target BLOCKVALIDATION = Target.the("blockValidation")
            .located(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/header/h5"));
}
