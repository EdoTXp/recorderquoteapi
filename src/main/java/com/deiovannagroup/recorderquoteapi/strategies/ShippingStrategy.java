package com.deiovannagroup.recorderquoteapi.strategies;

import com.deiovannagroup.recorderquoteapi.models.Recorder;

public interface ShippingStrategy {
    double calculate(Recorder recorder);
}
