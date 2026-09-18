package com.deiovannagroup.recorderquoteapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deiovannagroup.recorderquoteapi.dtos.QuoteResponse;
import com.deiovannagroup.recorderquoteapi.services.QuoteService;

@RestController
@RequestMapping("quotes")
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuoteResponse> getQuote(@PathVariable Long id) {
        QuoteResponse response = quoteService.generateQuote(id);
        return ResponseEntity.ok(response);
    }

}
