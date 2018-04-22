package com.test.controllers;

import com.test.model.FundDetail;
import com.test.service.FundDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping("/fund")
public class FundController {

    private FundDetailService fundDetailService;

    @Autowired
    public void setFundDetailService(FundDetailService fundDetailService)
    {
        this.fundDetailService=fundDetailService;
    }

    @ApiOperation(value="fund",notes = "fund",response = FundDetail.class, tags = "fund")
    @ApiResponse(code=200,message = "Fund with secId",response = FundDetail.class)
    @GetMapping("/{secId}")
    FundDetail getFund (@ApiParam(name="secId") @PathVariable(value = "secId") String secId)
    {
        return fundDetailService.getFundBySecId(secId);
    }

    @ApiOperation(value="fund",notes = "Add fund",response = FundDetail.class, tags = "fund")
    @ApiResponse(code=200,message = "add fund successful",response = FundDetail.class)
    @PostMapping("/add")
    FundDetail addFund(@RequestBody FundDetail fund)
    {
        if(fund!=null)
        {
            fundDetailService.updateFund(fund);
        }
        return fundDetailService.getFundBySecId(fund.getmStarID());
    }
}
