package q2;

import java.util.List;

public class Transportation {
    public static List<Vehicle> vehicles;
    public static String chose(double budget){
        StringBuilder result= new StringBuilder();
        vehicles.forEach(vehicle -> {
            if(vehicle.getCost()<=budget){
                result.append(vehicle.getName()).append(" is ok to be chosen.\n");
            }
        });
        return result.toString();
    }
}
