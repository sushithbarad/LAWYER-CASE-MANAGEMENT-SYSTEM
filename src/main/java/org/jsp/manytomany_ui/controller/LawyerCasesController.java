package org.jsp.manytomany_ui.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jsp.manytomany_ui.dao.LawyerCasesDao;
import org.jsp.manytomany_ui.dto.Cases;
import org.jsp.manytomany_ui.dto.Lawyer;

public class LawyerCasesController {

    public static void main(String[] args) {

 
        Cases case1 = new Cases();
        case1.setCname("Robbery");
        case1.setCtype("Criminal");
        case1.setCdate("10-12-2024");

        Cases case2 = new Cases();
        case2.setCname("Property Dispute");
        case2.setCtype("Civil");
        case2.setCdate("11-12-2024");

        Cases case3 = new Cases();
        case3.setCname("Cyber Fraud");
        case3.setCtype("Cyber Crime");
        case3.setCdate("12-12-2024");

        List<Cases> allCases = new ArrayList<>();
        allCases.add(case1);
        allCases.add(case2);
        allCases.add(case3);

 
        Lawyer l1 = new Lawyer();
        l1.setName("Sushith");
        l1.setExperience("5 Years");
        l1.setCases(allCases);  

        Lawyer l2 = new Lawyer();
        l2.setName("Rahul");
        l2.setExperience("3 Years");
        l2.setCases(allCases);
      
//        List<Cases> lawyer2Cases = new ArrayList<>();
//        lawyer2Cases.add(case1);
//        lawyer2Cases.add(case3);
//        l2.setCases(lawyer2Cases);

        Lawyer l3 = new Lawyer();
        l3.setName("Anil");
        l3.setExperience("10 Years");
        l3.setCases(Arrays.asList(case2,case3));


        LawyerCasesDao.save(l1);
        LawyerCasesDao.save(l2);
        LawyerCasesDao.save(l3);

        System.out.println("Multiple Lawyers & Multiple Cases saved successfully!");
    }
}
