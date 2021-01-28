package com.alba.demo.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import java.io.IOException;

import static org.reflections.Reflections.log;

public class SubwayJsonConverter implements AttributeConverter<SubwayStation, String> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(SubwayStation subwayStation) {
        try {
            return objectMapper.writeValueAsString(subwayStation);
        }
         catch (JsonProcessingException e) {
            log.error("fail to serialize as Object into Json : {}", subwayStation, e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public SubwayStation convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData, SubwayStation.class);
        } catch (IOException e) {
            log.error("fail to deserialize as Json into Object : {}", dbData, e);
            throw new RuntimeException(e);
        }
    }
}
