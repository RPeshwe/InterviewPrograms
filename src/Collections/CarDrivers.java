package Collections;

import java.util.*;

public class CarDrivers {

    String name;
    int age;
    float height;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public CarDrivers(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        CarDrivers cd1 = new CarDrivers("Nimish", 22, 5.6f);
        CarDrivers cd2 = new CarDrivers("Rahuk", 44, 5.10f);
        CarDrivers cd3 =  new CarDrivers("Pushpak", 25, 6.00f);
        CarDrivers c4 = new CarDrivers(null, 23, 4.4f);

        List<CarDrivers> carDriversList = Arrays.asList(cd1, cd2, cd3, c4);
        Collections.sort(carDriversList, Comparator.comparing(CarDrivers::getAge));

        //Collections.sort(carDriversList, Comparator.comparing(CarDrivers::getHeight));

       // Collections.sort(carDriversList, Comparator.comparing(CarDrivers::getName));
        //Collections.sort(carDriversList, Comparator.comparing(CarDrivers::getName, Comparator.nullsFirst(String::compareTo)));

        //Collections.sort(carDriversList, Comparator.comparing(CarDrivers::getName, Comparator.nullsLast(String::compareTo)));


        System.out.println("Sorting bia age");
        carDriversList.forEach(carDrivers -> System.out.println(carDrivers.getName() + carDrivers.getAge() + carDrivers.getHeight()));
    }
}
