package org.codedifferently.cbtyson.data;

import java.util.ArrayList;

public class Group {
    String name;
    String groupID;
    int size;
    ArrayList<Student> studentList;


    public Group(String name, String groupID, int size, ArrayList<Student> studentList) {
        this.name = name;
        this.groupID = groupID;
        this.size = size;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public String getGroupID() {
        return groupID;
    }

    public int getSize() {
        return size;
    }
}
