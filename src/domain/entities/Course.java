package domain.entities;

public class Course {

    private String courseName;

    //CONSTRUCTOR
    public Course(String courseName) {
        this.courseName = courseName;
    }

    //GET AND SET
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
