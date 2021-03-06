package com.devco.certification.booking.userinterfaces;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase PageObject que contiene el mapeo de la pagina principal.
 *
 * DefaultUrl: Url base, pagina inicial.
 *
 */

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.booking.com/index.es.html?")
public class BookingHomePage extends PageObject {

 public static final Target LOGIN_BUTTON = Target.the("login button").located(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[6]/a"));
 public static final Target SEARCH_BUTTON = Target.the("search button").located(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button"));
 public static final Target MAKE_ACCOUNT_BUTTON = Target.the("create account button").located(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a"));
 public static final Target CABS_BUTTON = Target.the("cabs button").located(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[2]/ul/li[5]/a"));
 public static final Target ATTRACTIONS_BTN = Target.the("attractions button").located(org.openqa.selenium.By.xpath("//*[@id=\"b2indexPage\"]/header/nav[2]/ul/li[4]/a"));
 public static final Target CARS_BTN = Target.the("cars button").located(org.openqa.selenium.By.xpath("//a[contains(@data-ga-track,'cars')]"));

}
