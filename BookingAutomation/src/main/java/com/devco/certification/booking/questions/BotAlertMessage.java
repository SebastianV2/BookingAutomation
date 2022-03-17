package com.devco.certification.booking.questions;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase Question que nos permite validar si el mensaje de alerta de bot es visible.
 *
 */

import com.devco.certification.booking.userinterfaces.InterruptionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class BotAlertMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return the(InterruptionPage.BOT_ALERT).answeredBy(actor).isCurrentlyVisible();
    }

    public static Question<Boolean> isDisplayed(){
        return new BotAlertMessage();
    }
}
