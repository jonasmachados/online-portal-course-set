package domain.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instructor {

    private String instructorName;

    private List<Course> coursrList = new ArrayList<>();

    //CONSTRUCTOR
    public Instructor() {
    }

    //CONSTRUCTOR
    public Instructor(String instructorName) {
        this.instructorName = instructorName;
    }


    //GET AND SET
    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String InstructorName) {
        this.instructorName = InstructorName;
    }

    public List<Course> getCoursrList() {
        return coursrList;
    }

    public void setCoursrList(List<Course> coursrList) {
        this.coursrList = coursrList;
    }

}
