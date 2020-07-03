package q1;

public class Main {
    public static void main(String[] args) {
        // 恰好用完预算
        System.out.println(Calculator.calculateSolution(100, 100,true));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        // 预算可以有剩余
        System.out.println(Calculator.calculateSolution(100, 100,false));
    }
}
