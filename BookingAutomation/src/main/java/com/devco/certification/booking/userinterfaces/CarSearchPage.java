package com.devco.certification.booking.userinterfaces;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase PageObject que contiene el mapeo de la pagina de busqueda de carros.
 *
 */

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarSearchPage extends PageObject {

    public static final Target PICKUP = Target.the("pickup text box").located(By.name("ss_origin"));
    public static final Target PICKUP_SLC = Target.the("pickup location").located(By.xpath("//*[@id=\"frm\"]/div[2]/div[1]/div/div[1]/ul[1]/li"));
    public static final Target DATE_PICK = Target.the("calendar").located(By.xpath("//*[@aria-label = 'Abrir el calendario']"));
    public static final Target F_DATE = Target.the("date").locatedBy("//*[text()='18'][1]");
    public static final Target SEARCH_BTN = Target.the("search button").located(By.xpath("//*[@id=\"frm\"]/div[2]/div[4]/div[2]/button"));

}
