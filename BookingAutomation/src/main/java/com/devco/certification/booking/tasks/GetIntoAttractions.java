package com.devco.certification.booking.tasks;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase Task que le permite a nuestro actor inresar a la pagina de busqueda de atracciones.
 *
 */

import com.devco.certification.booking.userinterfaces.BookingHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetIntoAttractions implements Task {
    @Override
    @Step("{0} Get into attractions search page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BookingHomePage.ATTRACTIONS_BTN));
    }

    public static GetIntoAttractions Page(){
        return instrumented(GetIntoAttractions.class);
    }

}
