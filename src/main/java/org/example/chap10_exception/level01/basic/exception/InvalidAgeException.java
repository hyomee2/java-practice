package org.example.chap10_exception.level01.basic.exception;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}
