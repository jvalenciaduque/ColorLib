package co.com.choucair.certification.RETOCOLORLIB.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

public class FormBlockValidation extends PageObject {

    public static final Target REQUIRED = Target.the("required")
            .located(By.xpath("//*[@id=\"required2\"]"));

    public static final Target EMAIL = Target.the("email")
            .located(By.xpath("//*[@id=\"email2\"]"));

    public static final Target PASSWORD = Target.the("password")
            .located(By.xpath("//*[@id=\"password2\"]"));

    public static final Target CONFIRMPASSWORD = Target.the("confirmPassword")
            .located(By.xpath("//*[@id=\"confirm_password2\"]"));

    public static final Target DATE = Target.the("date")
            .locatedBy("//*[@id=\"date2\"]");

    public static String fecha = "//*[@id=\"date2\"]";

    public static final Target URL = Target.the("url")
            .located(By.xpath("//*[@id=\"url2\"]"));

    public static final Target DIGITS = Target.the("digits")
            .located(By.xpath("//*[@id=\"digits\"]"));

    public static final Target RANGE = Target.the("range")
            .located(By.xpath("//*[@id=\"range\"]"));

    public static final Target POLICY = Target.the("policy")
            .located(By.xpath("//*[@id=\"agree2\"]"));

    public static final Target VALIDATE = Target.the("validate")
            .located(By.xpath("//*[@id=\"block-validate\"]/div[10]/input"));

    public static final Target ISREQUIRED = Target.the("isRequired")
            .located(By.xpath("//*[contains(text(),'This field is required.')]"));
}
