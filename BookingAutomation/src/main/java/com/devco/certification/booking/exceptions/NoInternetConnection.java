package com.devco.certification.booking.exceptions;

/**
 * @author sebas-garcia-123@hotmail.com
 *
 * Esta clase permite controlar una excepcion de fallo de red.
 *
 *  serialVersionUID: Variable predefinida de AssertionError, esta se crea una vez se importa AssertionError.
 *  No_INTERNET_CONECTION_MESSAGE: Variable que contiene el mensaje que se muestra en el informe de serenity.
 *
 */

public class NoInternetConnection extends AssertionError{

    private static final long serialVersionUID = 1L;
    public static final String NO_INTERNET_CONNECTION_MESSAGE = "No internet connection";

    public NoInternetConnection(String message, Throwable cause) {
        super(message, cause);
    }

}
