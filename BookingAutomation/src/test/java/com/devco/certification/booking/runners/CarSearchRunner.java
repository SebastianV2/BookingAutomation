package com.devco.certification.booking.runners;

/**
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase runner la cual nos permite correr el feature de busqueda de carros.
 *
 */

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_cars.feature",
        glue = "com.devco.certification.booking.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class CarSearchRunner {
}
