package com.test.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class SampleTestController {

    @ApiOperation(value="salute",notes="salute",tags={"Salute"})
    @ApiResponse(code=200,message="salute")
    @GetMapping("/salute")
    public String sayHello ()
    {
        return "hello spring boot";
    }
}
