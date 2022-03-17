package com.devco.certification.booking.runners;

/**
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase runner la cual nos permite correr el feature del login.
 *
 */

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = "com.devco.certification.booking.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class LoginRunner {
}
