package br.com.cavernadodragao;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/main/java/br/com/cavernadodragao/requirements",
        glue = "br.com.cavernadodragao.steps",
        monochrome = true
)

public class TestRunner {
}
