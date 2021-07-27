package br.com.cavernadodragao;

import br.com.cavernadodragao.utils.GlobalDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/main/java/br/com/cavernadodragao/requirements",
        glue = "br.com.cavernadodragao.steps",
        monochrome = true
)

public class TestRunner {

    @BeforeClass
    public static void oneTimeSetup() throws Exception {
        GlobalDriver.initiateDriver();
    }
}
