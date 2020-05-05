package com.retailers.retailers.mapping;

import com.retailers.retailers.model.Organization;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrganizationMapping {

    List<Organization> findOrganization();
}
