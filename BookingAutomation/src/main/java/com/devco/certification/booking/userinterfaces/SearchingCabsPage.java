package com.devco.certification.booking.userinterfaces;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase PageObject que contiene el mapeo de la pagina de carga luego de buscar taxis.
 *
 */

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchingCabsPage extends PageObject {

    public static final Target SEARCHING_SCREEN = Target.the("searching screen").located(By.xpath("/html/body/div[1]/div[2]/div/h1"));

}
