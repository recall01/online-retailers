package com.retailers.retailers.combination;

import java.util.List;

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

    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();
        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));
    }

    private static Branch compositeCorpTree() {
        Branch root = new Branch("王大麻子","总经理",100000);

        Branch developDep = new Branch("刘大瘸子","研发部门经理",80000);
        Branch salesDep = new Branch("马二拐","销售部门经理",80000);
        Branch financeDep = new Branch("赵三","财务部门经理",80000);

        Branch firstDevGroup = new Branch("杨三","开发一组组长",60000);
        Branch secondDevGroup = new Branch("吴大","开发二组组长",60000);

        Leaf a = new Leaf("a","开发人员",3000);
        Leaf b = new Leaf("b","开发人员",3000);
        Leaf c = new Leaf("c","开发人员",3000);
        Leaf d = new Leaf("d","开发人员",3000);
        Leaf e = new Leaf("e","开发人员",3000);
        Leaf f = new Leaf("f","开发人员",3000);
        Leaf g = new Leaf("g","开发人员",3000);
        Leaf h = new Leaf("h","销售人员",3000);
        Leaf i = new Leaf("i","销售人员",3000);
        Leaf j = new Leaf("j","财务人员",3000);
        Leaf k = new Leaf("k","CEO秘书",3000);
        Leaf laoliu = new Leaf("郑老刘","研发部副经理",7000);

        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);

        developDep.addSubordinate(laoliu);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);

        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);

        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);
        secondDevGroup.addSubordinate(d);

        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);

        financeDep.addSubordinate(j);

        return root;


    }


}
