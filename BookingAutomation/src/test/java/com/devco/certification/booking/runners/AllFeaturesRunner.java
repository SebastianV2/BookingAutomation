package com.devco.certification.booking.runners;

/**
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase runner la cual nos permite correr todos los features.
 *
 * RunWith: nos permite especificar la clase que correr los tests.
 *
 * CucumberOptions: Nos permite utilizar las opciones que contiene cucumber.
 *
 * features: Carpeta en la cual estan guardadas las features del proyecto.
 *
 * glue: Carptea en la cual estan guardados los stepdefinitions.
 *
 * snippets: lo utilizamos para que al generar los metodos estos cumplan con CAMELCASE.
 *
 */

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com.devco.certification.booking.stepdefinitions",
        tags = " @tag",
        snippets = SnippetType.CAMELCASE)

public class AllFeaturesRunner {
}
