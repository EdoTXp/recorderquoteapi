package com.deiovannagroup.recorderquoteapi.services;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.deiovannagroup.recorderquoteapi.dtos.QuoteResponse;
import com.deiovannagroup.recorderquoteapi.exceptions.RecorderNotFoundException;
import com.deiovannagroup.recorderquoteapi.exceptions.ShippingStrategyNotFoundException;
import com.deiovannagroup.recorderquoteapi.models.Recorder;
import com.deiovannagroup.recorderquoteapi.repositories.RecorderRepository;
import com.deiovannagroup.recorderquoteapi.strategies.ShippingStrategy;

@Service
public class QuoteService {

    private final RecorderRepository recorderRepository;
    private final Map<String, ShippingStrategy> shippingStrategies;

    public QuoteService(
            RecorderRepository recorderRepository,
            Map<String, ShippingStrategy> shippingStrategies) {
        this.recorderRepository = recorderRepository;
        this.shippingStrategies = shippingStrategies;
    }

    public QuoteResponse generateQuote(Long recorderId) {
        Recorder recorder = recorderRepository
                .findById(recorderId)
                .orElseThrow(() -> new RecorderNotFoundException(recorderId));

        String sizeKey = recorder.getSize().name();
        ShippingStrategy strategy = shippingStrategies.get(sizeKey);

        if (strategy == null) {
            throw new ShippingStrategyNotFoundException(sizeKey);
        }

        double shippingCost = strategy.calculate(recorder);
        return new QuoteResponse(recorder, shippingCost);
    }

}
