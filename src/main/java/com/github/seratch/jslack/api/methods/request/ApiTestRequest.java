package com.github.seratch.jslack.api.methods.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiTestRequest {

    private String foo;
    private String error;
}