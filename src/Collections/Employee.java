package Collections;

import java.util.Collections;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.Semaphore;

public class Employee implements Comparable<Employee>{
    String name;
    int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Sudhir", 60);
        Employee e2 = new Employee("Sudhakar", 55);
        Employee e3 = new Employee("Namita", 65);

        TreeSet<Employee> emp = new TreeSet<Employee>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        emp.forEach(employee -> System.out.println(employee.getAge() + employee.getName()));
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
       /* if (age > o.age){
            return 1;
        } else if (age < o.age) {
            return -1;
        }
        return 0;*/
    }
}
