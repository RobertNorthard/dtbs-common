package com.robertnorthard.dtbs.server.common.exceptions;

/**
 * AccountAlreadyExistsException
 * @author robertnorthard
 */
public class AccountAlreadyExistsException extends Exception {
    public AccountAlreadyExistsException(String message){
        super("Account already exists");
    }
}
