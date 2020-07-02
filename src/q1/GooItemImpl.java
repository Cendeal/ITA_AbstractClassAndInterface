package q1;

public class GooItemImpl implements IGoodItem {
    private double price;
    private String name;
    private int count;
    GooItemImpl(String name,double price){
        this.price = price;
        this.name = name;
    }
    @Override
    public int getMaxValue(double budget) {
        return (int) Math.floor(budget/this.price);
    }

    @Override
    public double getAmount() {
        return count*price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("[%s]: price = %.2f(yuan),buy = %d,amount = %.2f\n",name,price,count,getAmount());
    }
}
