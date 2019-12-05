package org.academiadecodigo.hackathon.help7hearts.exception;

import org.academiadecodigo.hackathon.help7hearts.error.ErrorMessage;

public class CharityNotFoundException extends Help7HeartsException {

    public CharityNotFoundException() {
        super(ErrorMessage.CHARITY_NOT_FOUND);
    }
}
