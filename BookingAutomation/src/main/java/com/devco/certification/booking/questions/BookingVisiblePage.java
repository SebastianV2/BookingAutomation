package com.devco.certification.booking.questions;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase Question que nos permite validar si el boton de busqueda de la pagina principal es visible.
 *
 */

import com.devco.certification.booking.userinterfaces.BookingHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class BookingVisiblePage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return the(BookingHomePage.SEARCH_BUTTON).answeredBy(actor).isCurrentlyVisible();
    }

    public static Question<Boolean> isVisible() {
        return new BookingVisiblePage();
    }
}
