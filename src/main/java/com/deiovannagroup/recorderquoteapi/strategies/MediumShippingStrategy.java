package com.deiovannagroup.recorderquoteapi.strategies;

import org.springframework.stereotype.Component;

import com.deiovannagroup.recorderquoteapi.enums.MaterialType;
import com.deiovannagroup.recorderquoteapi.models.Recorder;

@Component("MEDIUM")
public class MediumShippingStrategy implements ShippingStrategy {

    @Override
    public double calculate(Recorder recorder) {
        double cost = 10.00;

        if (recorder.getMaterial() == MaterialType.WOOD) {
            cost += 15.00;
        }

        return cost;
    }

}
