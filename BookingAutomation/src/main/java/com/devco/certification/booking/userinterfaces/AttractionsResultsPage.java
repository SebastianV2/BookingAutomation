package com.devco.certification.booking.userinterfaces;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase PageObject que contiene el mapeo de la pagina de resultados de busqueda de atracciones turisticas.
 *
 */

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AttractionsResultsPage extends PageObject {

    public static Target CATEGORY = Target.the("category").locatedBy("//*[text()='{0}']");
    public static final Target OPTION = Target.the("option").located(By.xpath("//*[@class='css-xbcz3d'][1]"));

}
