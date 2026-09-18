package com.deiovannagroup.recorderquoteapi.dtos;

import com.deiovannagroup.recorderquoteapi.models.Recorder;

import lombok.Data;

@Data
public class QuoteResponse {
    private Long recorderId;
    private String recorderName;
    private String material;
    private String size;
    private double basePrice;
    private double shippingCost;
    private double totalPrice;

    public QuoteResponse(Recorder recorder, double shippingCost) {
        this.recorderId = recorder.getId();
        this.recorderName = recorder.getName();
        this.material = recorder.getMaterial().name();
        this.size = recorder.getSize().name();
        this.basePrice = recorder.getBasePrice();
        this.shippingCost = shippingCost;
        this.totalPrice = recorder.getBasePrice() + shippingCost;
    }
}
