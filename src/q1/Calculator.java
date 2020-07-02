package q1;

public class Calculator {
    public static String calculateSolution(double budget, int targetTotal) {
        StringBuilder result = new StringBuilder(String.format("budget:%.2f,targetTotal:%d\n",budget,targetTotal)
);
        GooItemImpl cock = new GooItemImpl("cock", 5);
        GooItemImpl hen = new GooItemImpl("hen", 3);
        GooItemImpl chicken = new GooItemImpl("chicken", 1 / 3.0);
        int solution = 0;

        for (int i = cock.getMaxValue(budget); i >= 0; i--) {
            for (int j = hen.getMaxValue(budget); j >= 0; j--) {
                if (i * cock.getPrice() + j * hen.getPrice() + chicken.getPrice() * (targetTotal - i - j) == targetTotal) {
                    cock.setCount(i);
                    hen.setCount(j);
                    chicken.setCount(targetTotal - i - j);
                    result.append("=========solution================\n")
                            .append(cock.toString())
                            .append(hen.toString())
                            .append(chicken.toString());
                    solution++;
                }
            }
        }
        result.append("================================\n").append("total solutions is ").append(solution).append('.');
        return result.toString();
    }
}
