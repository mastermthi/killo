
public class Calculator {
    public static int add(int ...n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        return sum;
    }

    public static int multiply(int ...i) {
        int product = 1;
        for (int j = 0; j < i.length; j++) {
            product *= i[j];
        }
        return product;
    }

}

