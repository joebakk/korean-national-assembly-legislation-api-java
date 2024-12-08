package com.ogongchill.nationalAssembly.core.api.exception;

import lombok.Getter;

@Getter
public class UnexpectedResponseException extends RuntimeException {
    private final String actual;
    private final String expected;

    public UnexpectedResponseException(Throwable cause, String actual, String expected) {
        super(cause);
        this.actual = actual;
        this.expected = expected;
    }
}
