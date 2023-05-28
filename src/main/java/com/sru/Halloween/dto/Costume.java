package com.sru.Halloween.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NonNull;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Costume {
    @NonNull
    private String name;
    @NonNull
    private String description;
}
