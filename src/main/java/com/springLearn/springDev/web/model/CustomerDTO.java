package com.springLearn.springDev.web.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CustomerDTO {
    private String customerName;
    private String customerEmail;
    private String mobileNumber;
}
