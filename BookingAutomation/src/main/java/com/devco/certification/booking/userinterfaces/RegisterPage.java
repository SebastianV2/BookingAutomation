package com.devco.certification.booking.userinterfaces;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase PageObject que contiene el mapeo de la pagina del registro.
 *
 */

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage extends PageObject {

    public static final Target USERNAME = Target.the("username").located(By.name("username"));
    public static final Target CONTINUE_BUTTON = Target.the("continue button").located(By.xpath("//*[text()='Continuar con e-mail']"));
    public static final Target NEW_PASSWORD = Target.the("password").located(By.name("new_password"));
    public static final Target C_NEW_PASSWORD = Target.the("confirm password").located(By.name("confirmed_password"));
    public static final Target CREATE_ACCOUNT_BUTTON = Target.the("create account button").located(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button"));
    public static final Target CAPTCHA_TITTLE = Target.the("captcha tittle").located(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/h3"));

}
