package com.ilargia.games.entitas.exceptions;

public class EntityIsAlreadyRetainedByOwnerException extends RuntimeException {

    public EntityIsAlreadyRetainedByOwnerException(Object owner) {
        super("Entity is already retained by owner: " + owner);
    }

}