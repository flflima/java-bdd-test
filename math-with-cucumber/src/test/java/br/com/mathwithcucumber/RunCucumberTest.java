package br.com.mathwithcucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, glue = {"src/test/java/br/com/mathwithcucumber"}, features = {
    "src/test/resources/br/com/mathwithcucumber"})
public class RunCucumberTest {

}
