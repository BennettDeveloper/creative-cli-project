package org.codedifferently.cbtyson.menus;

import org.codedifferently.cbtyson.data.Group;
import org.codedifferently.cbtyson.data.GroupList;
import org.codedifferently.cbtyson.data.Student;

public class ViewMenu {

    public void viewGroups() {

        if (GroupList.GetGroups().isEmpty()) {
            System.out.println("No groups available.");
            return;
        }

        for (Group group : GroupList.GetGroups()) {

            System.out.println("==================================");
            System.out.println("Group Name: " + group.getName());
            System.out.println("Group ID: " + group.getGroupID());
            System.out.println("Students:");

            for (Student student : group.getStudentList()) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " | ID: " + student.getStudentID() + " | GPA: " + student.getGpa());
            }

            System.out.println("==================================");
            System.out.println();
        }
    }
}