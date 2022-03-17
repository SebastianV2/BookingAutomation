package com.devco.certification.booking.tasks;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase Task que le permite a nuestro actor ingresar a la pagina de login.
 *
 */

import com.devco.certification.booking.userinterfaces.BookingHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetIntoSign implements Task {
    @Override
    @Step("{0} Get into login page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BookingHomePage.LOGIN_BUTTON));
    }

    public static GetIntoSign InPage(){
        return instrumented(GetIntoSign.class);
    }

}
