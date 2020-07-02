package q2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("car",500));
        vehicles.add(new Vehicle("bus",300));
        vehicles.add(new Vehicle("train",400));
        vehicles.add(new Vehicle("plane",1000));
        Transportation.vehicles = vehicles;
        System.out.println(Transportation.chose(500));
    }
}
