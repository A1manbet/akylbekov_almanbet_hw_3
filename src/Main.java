import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] numbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, 3, 3, 5};

        double result = 0;
        int count = 0;
        boolean a = false;

        for (double x : numbers){

            if (x < 0) {
                a = true;
            }
            if (a && x > 0) {
                result += x;
                count += 1;
            }

        }
        System.out.println(result/count);
    }
}