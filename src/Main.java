public class Main {
    public static void main(String[] args) {
        double[] nums = {1.2, 8.6, 1.7, 5.9, 4.4, -9.1, 1.7, -2.8, -5.3, 16.2, -11.1, -13.2, 14.3, -11.4, 12.5};
        double sum = 0;
        boolean negative = false;
        int length = 0;

        for (double valli : nums) {
            if (valli < 0) {
                negative = true;
            }
            if (negative == true) {
                if (valli>=0) {
                    sum = sum + valli;
                    length++;
                }
            }
        }
        double result = sum / length;
        System.out.println(result);


    }
}

