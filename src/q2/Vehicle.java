package q2;

public class Vehicle {
    private double cost;
    private String name;

    public Vehicle(String name,double cost){
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void taking(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
