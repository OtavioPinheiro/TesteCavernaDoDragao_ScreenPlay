package br.com.cavernadodragao;

import br.com.cavernadodragao.utils.GlobalDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/main/java/br/com/cavernadodragao/requirements",
        glue = "br.com.cavernadodragao.steps",
        plugin = {"pretty", "html:src/test/java/relatorios/relatorio.html"},
        monochrome = true
)

public class TestRunner {

    @BeforeClass
    public static void oneTimeSetup() throws Exception {
        GlobalDriver.initiateDriver();
    }

    @AfterClass
    public static void oneTimeSetupEnd() throws Exception {
        GlobalDriver.closeDriver();
    }
}
