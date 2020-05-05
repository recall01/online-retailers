package com.retailers.retailers.service;

import com.retailers.retailers.combination.Branch;
import com.retailers.retailers.combination.Client;
import com.retailers.retailers.combination.Corp;
import com.retailers.retailers.mapping.OrganizationMapping;
import com.retailers.retailers.model.Organization;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author PC
 * @data 2020/5/5
 */
@Service
public class OrganizationService {

    @Resource
    private OrganizationMapping organizationMapping;

    public Corp findOrganization() {
        List<Organization> organizationList = organizationMapping.findOrganization();
        Client.initOrganizationTree(organizationList);
        return Client.initOrganizationTree(organizationList);
    }
}
