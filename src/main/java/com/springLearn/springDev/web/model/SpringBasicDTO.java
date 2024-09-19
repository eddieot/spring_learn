package com.springLearn.springDev.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpringBasicDTO {
    private UUID id;
    private String carName;
    private String carStyle;
    private Long upc;
}
