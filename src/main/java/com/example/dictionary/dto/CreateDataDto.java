package com.example.dictionary.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Schema(description = "DTO for creating a new data record")
public class CreateDataDto {
    @Schema(description = "Code of the data record", example = "001", requiredMode = Schema.RequiredMode.REQUIRED)
    private String code;

    @Schema(description = "Value of the data record", example = "Hello", requiredMode = Schema.RequiredMode.REQUIRED)
    private String value;
}
