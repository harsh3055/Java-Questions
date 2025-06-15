package org.example.OOPS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                '}';
    }
};
class SortbyRoll implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.roll_no - b.roll_no;
    }
}
public class comparator {
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<Student>();
        students.add(new Student(27, "harsh"));
        students.add(new Student(15, "urvashi"));
        Collections.sort(students, new SortbyRoll());
        for(Student s : students){
            System.out.println(s);
        }
    }
}
