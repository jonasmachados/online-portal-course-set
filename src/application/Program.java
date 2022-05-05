package application;

import domain.entities.Course;
import domain.entities.User;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<User> courseA = new HashSet<>();
        Set<User> courseB = new HashSet<>();
        Set<User> courseC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int code = sc.nextInt();

            User user = new User(code);
            courseA.add(user);
        }

        System.out.print("How many students for course B? ");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            int code = sc.nextInt();

            User user = new User(code);
            courseB.add(user);
        }

        System.out.print("How many students for course C? ");
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int code = sc.nextInt();

            User user = new User(code);
            courseC.add(user);
        }

        Course course = new Course();
        course.totalStudents(courseA, courseB, courseC);

        sc.close();

    }
}
