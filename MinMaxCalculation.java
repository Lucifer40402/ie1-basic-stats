import java.util.Arrays;
import java.util.Scanner;

public class MinMaxCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Calculate min and max
        double min = findMin(numbers);
        double max = findMax(numbers);

        // Print results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }

    public static double findMin(double[] numbers) {
        return Arrays.stream(numbers).min().orElse(Double.NaN);
    }

    public static double findMax(double[] numbers) {
        return Arrays.stream(numbers).max().orElse(Double.NaN);
    }
}

