package com.deiovannagroup.recorderquoteapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ShippingStrategyNotFoundException extends RuntimeException {
    public ShippingStrategyNotFoundException(String sizeKey) {
        super("Shipping strategy not found for size: " + sizeKey);
    }

}
