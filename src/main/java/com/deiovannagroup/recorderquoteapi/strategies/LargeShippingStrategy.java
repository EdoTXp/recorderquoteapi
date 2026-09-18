package com.deiovannagroup.recorderquoteapi.strategies;

import org.springframework.stereotype.Component;

import com.deiovannagroup.recorderquoteapi.enums.MaterialType;
import com.deiovannagroup.recorderquoteapi.models.Recorder;

@Component("LARGE")
public class LargeShippingStrategy implements ShippingStrategy {

    @Override
    public double calculate(Recorder recorder) {
        double cost = 25.00;

        if (recorder.getMaterial() == MaterialType.WOOD) {
            cost += 20.00;
        }

        return cost;
    }

}
