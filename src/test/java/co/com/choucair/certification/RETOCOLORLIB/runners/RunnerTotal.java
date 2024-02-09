package co.com.choucair.certification.RETOCOLORLIB.runners;

import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import utils.BeforeSuite;
import utils.DataToFeature;
import utils.RunnerPersonalizado;
import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = "src/test/resources/features/block_validation.feature",
        tags = "@HistoriaDeUsuario",
        glue = {"co.com.choucair.certification.RETOCOLORLIB.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerTotal {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/block_validation.feature");
    }
}
