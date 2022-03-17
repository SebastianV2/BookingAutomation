package com.devco.certification.booking.questions;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase Question que nos permite validar si el nombre de la actividad seleccionada es visible.
 *
 */

import com.devco.certification.booking.userinterfaces.SelectedAttractionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ActivityName implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return the(SelectedAttractionPage.ACTIVITY_NAME).answeredBy(actor).isCurrentlyVisible();
    }

    public static Question<Boolean> isDisplayed() {
        return new ActivityName();
    }
}
