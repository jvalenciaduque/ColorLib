package co.com.choucair.certification.RETOCOLORLIB.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static final Target USERFIELD = Target.the("userField")
            .located(By.xpath("//*[@id=\"login\"]/form/input[1]"));

    public static final Target PASSWORDFIELD = Target.the("passwordField")
            .located(By.xpath("//*[@id=\"login\"]/form/input[2]"));

    public static final Target LOGINBUTTON = Target.the("loginButton")
            .located(By.xpath("//*[@id=\"login\"]/form/button"));
}
