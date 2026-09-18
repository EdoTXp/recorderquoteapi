package com.deiovannagroup.recorderquoteapi.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.deiovannagroup.recorderquoteapi.enums.MaterialType;
import com.deiovannagroup.recorderquoteapi.enums.SizeType;
import com.deiovannagroup.recorderquoteapi.models.Recorder;
import com.deiovannagroup.recorderquoteapi.repositories.RecorderRepository;

@Configuration
public class DatabaseSeeder {

    @Bean
    CommandLineRunner initDatabase(RecorderRepository repository) {
        return args -> repository.saveAll(Arrays.asList(
                new Recorder(1L,
                        "Yamaha Sopranino",
                        MaterialType.PLASTIC,
                        SizeType.SMALL,
                        15.00),
                new Recorder(2L,
                        "Yamaha Soprano",
                        MaterialType.PLASTIC,
                        SizeType.SMALL,
                        20.00),
                new Recorder(3L,
                        "Yamaha Contralt",
                        MaterialType.PLASTIC,
                        SizeType.MEDIUM,
                        35.00),
                new Recorder(4L,
                        "Yamaha Tenor",
                        MaterialType.PLASTIC,
                        SizeType.LARGE,
                        80.00),
                new Recorder(5L,
                        "Yamaha Bass",
                        MaterialType.PLASTIC,
                        SizeType.LARGE,
                        250.00),
                new Recorder(6L,
                        "Moeck Soprano",
                        MaterialType.WOOD,
                        SizeType.SMALL,
                        120.00),
                new Recorder(7L,
                        "Mollenhauer Contralt",
                        MaterialType.WOOD,
                        SizeType.MEDIUM,
                        280.00)));

    }
}
