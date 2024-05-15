package com.example.transactionalapp.excepiton;

/**
 * @author mbucak on 15.05.2024 11:39
 */
public class InsufficientAmountException extends RuntimeException {
    public InsufficientAmountException(String msg) {
        super(msg);
    }
}
