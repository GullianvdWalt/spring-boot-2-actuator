package com.gvdw.springbootactuator.customEndpoint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By Gullian Van Der Walt at 07:24 on Apr, 2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomEndpointResponse {
    private int id;
    private String name;
    private String stauts;
}
