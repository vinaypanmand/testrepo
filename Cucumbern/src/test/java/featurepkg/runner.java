package featurepkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "D:\\NYC Practice\\Cucumbern\\src\\test\\resources\\Search_Feature.feature",
glue = "featurepkg",
plugin = {"pretty", "html:target/cucumber-reports.html"},
monochrome = true,
tags = "@mm"
)



public class runner {

	
	
	
	
}
