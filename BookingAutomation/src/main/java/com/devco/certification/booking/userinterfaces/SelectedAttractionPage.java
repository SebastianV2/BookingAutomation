package com.devco.certification.booking.userinterfaces;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase PageObject que contiene el mapeo del nombre de la actividad seleccionada.
 *
 */

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectedAttractionPage extends PageObject {

    public static final Target ACTIVITY_NAME = Target.the("activity name").located(By.xpath("//h2[contains(@class,'css-1uk1gs8')]"));

}
