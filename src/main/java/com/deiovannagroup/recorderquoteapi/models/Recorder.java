package com.deiovannagroup.recorderquoteapi.models;

import com.deiovannagroup.recorderquoteapi.enums.MaterialType;
import com.deiovannagroup.recorderquoteapi.enums.SizeType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Recorder {
    @Id
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private MaterialType material;

    @Enumerated(EnumType.STRING)
    private SizeType recorderSize;

    private double basePrice;
}
