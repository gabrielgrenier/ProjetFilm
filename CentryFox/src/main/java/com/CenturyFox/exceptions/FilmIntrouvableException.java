package com.CenturyFox.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FilmIntrouvableException extends RuntimeException{
    public FilmIntrouvableException(String s) {
        super(s);
    }
}