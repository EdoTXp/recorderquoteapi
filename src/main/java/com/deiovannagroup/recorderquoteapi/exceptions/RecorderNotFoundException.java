package com.deiovannagroup.recorderquoteapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecorderNotFoundException extends RuntimeException {

    public RecorderNotFoundException(Long id) {
        super("Recorder not found with ID: " + id);
    }
}
