package day48_constructors_static;

import java.util.Arrays;
import java.util.Scanner;

public class SybertekGroupsObjectClass {
    public static void main(String[] args) {
      Group group1 = new Group("Cyberbugs"); //dependency injection. Group object depends on String name
        //print size of members
        System.out.println(group1.getMembers().size());
        //how to add some people
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Rasim");

        System.out.println(group1.getMembers().size());
        // print all
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Meerim", "Daud", "Gylia", "Serkan", "Masha"));
        //print all members. without using toString()
        System.out.println("group2 members = " + group2.getMembers());

        //use if statement to check if Meerim is in group2
        if(group2.getMembers().contains("Meerim")) {
            System.out.println("Meerim is a member of group2");
        }else{
            System.out.println("Meerim is not group2");
        }
        //remove some members from group1
        group1.removeMember("Berk");
        group1.removeMember("Pavel");
        System.out.println(group1);

    }
}
