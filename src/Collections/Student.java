package Collections;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}
