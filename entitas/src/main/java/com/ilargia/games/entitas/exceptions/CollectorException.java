package com.ilargia.games.entitas.exceptions;

import com.ilargia.games.entitas.api.EntitasException;

public class CollectorException extends EntitasException {
    public CollectorException(String message, String hint) {
        super(message, hint);
    }
}