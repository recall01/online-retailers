package com.retailers.retailers.controller;

import com.retailers.retailers.model.Result;
import com.retailers.retailers.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PC
 * @data 2020/5/5
 */
@RestController
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @GetMapping("organization")
    public Result getOrganization(){
        return new Result(organizationService.findOrganization());
    }



}
