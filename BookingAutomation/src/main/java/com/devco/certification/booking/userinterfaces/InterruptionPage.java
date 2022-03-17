package com.devco.certification.booking.userinterfaces;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase PageObject que contiene el mapeo de la pagina de interrupcion por bots.
 *
 */

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterruptionPage extends PageObject {

    public static final Target BOT_ALERT = Target.the("bot alert").located(By.xpath("/html/body/div/h1"));

}
