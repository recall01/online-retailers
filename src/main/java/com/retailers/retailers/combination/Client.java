package com.retailers.retailers.combination;

import com.retailers.retailers.model.Organization;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * @author PC
 * @data 2020/5/4
 */
public class Client {
    public static String getTreeInfo(Branch root){
        List<Corp> subordinateList = root.getSubordinateList();
        StringBuilder info = new StringBuilder();
        for (Corp corp:subordinateList) {
            if(corp instanceof Leaf){
                info.append(corp.getInfo()).append("\n");
            }else {
                info.append(corp.getInfo()).append("\n").append(getTreeInfo((Branch) corp));
            }
        }
        return info.toString();
    }

    public static Branch initOrganizationTree(List<Organization> organizationList){
        AtomicReference<Branch> ceo = new AtomicReference<>();
        List<Organization> filterData = organizationList.stream().filter(bean -> {
            if (bean.getFather() == 0) {
                ceo.set(new Branch(bean.getId(),bean.getName()));
                return false;
            }
            return true;
        }).collect(Collectors.toList());
        //初始化树
        initBranch(ceo.get(),filterData);
        return ceo.get();
    }

    private static void initBranch(Branch branch,List<Organization> organizationList) {
        organizationList.forEach(bean -> {
            if (bean.getFather() == branch.getId()) {
                if(bean.getIsLeaf()==1){
                    branch.addSubordinate(new Leaf(bean.getId(),bean.getName()));
                }else {
                    Branch tempBranch = new Branch(bean.getId(),bean.getName());
                    branch.addSubordinate(tempBranch);
                    initBranch(tempBranch,organizationList);
                }
            }
        });
    }


}
