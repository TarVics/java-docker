package ua.tarvic.javadocker.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class FieldExceptionsDTO {
    private int code;
    private Map<String, String> errors;
}
