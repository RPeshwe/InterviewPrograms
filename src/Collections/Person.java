package Collections;

import java.util.*;

public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Person p1) {
      if (p1.age > age){
          return -1;
      }
      else if (p1.age < age){
          return 1;
      }
      return 0;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Vijay", 22);
        Person p2 = new Person("Rahul",55);
        Person p3 = new Person("Neha",29);

        List<Person> personsList = Arrays.asList(p1, p2, p3);
        Collections.sort(personsList);
        personsList.forEach(person ->
                System.out.println(person.getAge()+person.getName()));
    }
}
