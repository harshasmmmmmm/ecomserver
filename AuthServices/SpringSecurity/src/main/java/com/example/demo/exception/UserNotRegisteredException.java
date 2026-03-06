// src/main/java/com/example/demo/exception/UserNotRegisteredException.java
package com.example.demo.exception;

public class UserNotRegisteredException extends RuntimeException {
    public UserNotRegisteredException(String message) {
        super(message);
    }
}
