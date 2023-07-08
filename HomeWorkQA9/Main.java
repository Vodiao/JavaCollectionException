import exceptions.InvalidBrandCarException;
import exceptions.InvalidColorCarException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("blue", "bmw", 4);

        try {
            car.setColor("yellow");
        } catch (InvalidColorCarException ignored) {
            try {
                car.setBrand("");
            } catch (InvalidBrandCarException exception) {
                System.out.println("An error has occurred: " + exception.getMessage());
            } finally {
                System.out.println("End of the program");
            }
        }
        System.out.println();
        arrayList();
    }

    public static void arrayList() {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        list = new LinkedList<>(list);

        list.remove(2);
        list.remove(3);
        list.remove(4);

        list.set(0, 100);

        System.out.println(list);

    }


}