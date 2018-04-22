package com.test.controllers;

import com.test.service.FundDetailService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Fund Controller")
class FundControllerTest {

   private FundController fundController;


    @BeforeAll
    @DisplayName("Initialize fundController and fundDetailService")
    void init()
    {
        fundController=new FundController();
        fundController.setFundDetailService(new FundDetailService());
        assertNotNull(fundController);

    }
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setFundDetailService() {
    }

    @Test
    void getFund() {
        fundController.getFund()
    }

    @Test
    void addFund() {
    }
}