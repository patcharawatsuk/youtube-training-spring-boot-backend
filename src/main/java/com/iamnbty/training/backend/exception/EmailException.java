package com.iamnbty.training.backend.exception;

public class EmailException extends BaseException {

    public EmailException(String code) {
        super("email." + code);
    }

    public static EmailException templateNotfound() {
        return new EmailException("template.not.found");
    }

}