package domain.entities;

import java.util.HashSet;
import java.util.Set;

public class Course {

    public void totalStudents(Set courseA, Set courseB,Set courseC){
        
        Set<User> total = new HashSet<>(courseA);
		total.addAll(courseB);
		total.addAll(courseC);
        System.out.println("Total users: " + total.size());
    }
      

    //CONSTRUCTOR
    public Course() {
    }

    

}