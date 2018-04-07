package com.test.controllers;

import com.test.model.FundDetail;
import com.test.service.FundDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("/fund")
public class FundController {

    FundDetailService fundDetailService;

    @Autowired
    public void setFundDetailService(FundDetailService fundDetailService)
    {
        this.fundDetailService=fundDetailService;
    }

    @ApiOperation(value="fund",notes = "fund",response = FundDetail.class, tags = "fund")
    @ApiResponse(code=200,message = "Fund with secId",response = FundDetail.class)
    @GetMapping("/{secId}")
    FundDetail getFund (@PathVariable String secId)
    {
        return fundDetailService.getFundBySecId(secId);
    }
}
