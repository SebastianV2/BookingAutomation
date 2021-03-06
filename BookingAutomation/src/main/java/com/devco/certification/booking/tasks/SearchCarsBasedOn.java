package com.devco.certification.booking.tasks;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase Task que le permite a nuestro actor ingresar sus preferencias para buscar carros.
 *
 */

import com.devco.certification.booking.models.CarsModel;
import com.devco.certification.booking.userinterfaces.CarSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchCarsBasedOn implements Task {

    private CarsModel carsModel;

    public SearchCarsBasedOn(CarsModel carsModel) {
        this.carsModel = carsModel;
    }

    @Override
    @Step("{0} Enters car preferences")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(carsModel.getLoc()).into(CarSearchPage.PICKUP),
                WaitUntil.the(CarSearchPage.PICKUP_SLC, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CarSearchPage.PICKUP_SLC),
                Click.on(CarSearchPage.DATE_PICK),
                Click.on(CarSearchPage.F_DATE),
                Click.on(CarSearchPage.SEARCH_BTN));
    }

    public static SearchCarsBasedOn user(CarsModel carsModel){
        return instrumented(SearchCarsBasedOn.class, carsModel);
    }
}
