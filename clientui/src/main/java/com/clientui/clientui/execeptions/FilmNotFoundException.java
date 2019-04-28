package com.clientui.clientui.execeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FilmNotFoundException extends RuntimeException{
    public FilmNotFoundException(String s) {
        super(s);
    }
}
