package com.gvdw.springbootactuator.customEndpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * Created By Gullian Van Der Walt at 07:23 on Apr, 2021
 */
@Component
@Endpoint(id="gvdw", enableByDefault = true)
public class CustomEndpoint {

    @ReadOperation
    public CustomEndpointResponse getCustomResponse(){
        return new CustomEndpointResponse(1, "Gullian ", "Active ");
    }
}
