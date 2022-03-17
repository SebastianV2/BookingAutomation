package com.devco.certification.booking.userinterfaces;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase PageObject que contiene el mapeo de la pagina de busqueda de atracciones turisticas.
 *
 */

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AttractionsSearchPage extends PageObject {

    public static final Target ATTRACTION_TXT = Target.the("search text box").located(By.name("query"));
    public static final Target SEARCH_BTN = Target.the("search button").located(By.xpath("//*[text()='Buscar']"));

}