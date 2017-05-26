package com.dongduong.spring.biz.controller;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dongduong.spring.biz.dto.Fuel;

@Controller
public class FuelController {

	// API - read
    @PreAuthorize("#oauth2.hasScope('fuel')")
    @RequestMapping(method = RequestMethod.GET, value = "/fuel/{id}")
    @ResponseBody
    public Fuel findById(@PathVariable final long id) {
        //return new Pay(Long.parseLong(randomNumeric(2)), randomAlphabetic(4));
        return new Fuel(Long.parseLong(randomNumeric(2)), "Fuel product");
    }
}
