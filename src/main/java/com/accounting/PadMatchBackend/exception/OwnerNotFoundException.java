package com.accounting.PadMatchBackend.exception;

public class OwnerNotFoundException extends RuntimeException {
    public OwnerNotFoundException(int id) {
        super("Could not find the owner with the id " + id);
    }
}
