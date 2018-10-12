package com.globalhack.microwebservice.gateway.app.cucumber.stepdefs;

import com.globalhack.microwebservice.gateway.app.GlobalhackMicrowebservicesGatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = GlobalhackMicrowebservicesGatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
