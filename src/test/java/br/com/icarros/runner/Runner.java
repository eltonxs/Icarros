package br.com.icarros.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/main/java/br/com/icarros/feature", tags = "@pesquisar", glue = "br.com.icarros.steps", strict = true)
@RunWith(Cucumber.class)
@CucumberOptions (features = "src/main/java/br/com/icarros/feature",
glue = { "br.com.icarros.steps", "br.com.icarros.core"},
tags = { "@geral", "@pesquisar" },
monochrome = true, //
dryRun = false, // ver se tem alguns steps implementados quando esta rodando
strict= true)
public class Runner {

}
