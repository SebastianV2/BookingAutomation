package com.devco.certification.booking.tasks;

/**
 *
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase Task que le permite a nuestro actor llenar los datos para una cuenta en booking.
 *
 */

import com.devco.certification.booking.models.UserModel;
import com.devco.certification.booking.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateAnAccountWith implements Task {

    private UserModel userModel;

    public CreateAnAccountWith(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    @Step("{0} Create an account")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userModel.getUsername()).into(RegisterPage.USERNAME),
                Click.on(RegisterPage.CONTINUE_BUTTON),
                WaitUntil.the(RegisterPage.NEW_PASSWORD, isVisible()),
                Enter.theValue(userModel.getPassword()).into(RegisterPage.NEW_PASSWORD),
                Enter.theValue(userModel.getPassword()).into(RegisterPage.C_NEW_PASSWORD),
                Click.on(RegisterPage.CREATE_ACCOUNT_BUTTON));

    }

    public static CreateAnAccountWith credentials(UserModel userModel) {
        return instrumented(CreateAnAccountWith.class, userModel);
    }

}
