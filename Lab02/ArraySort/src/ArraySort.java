//package lab02;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        double[] costs = {19.95, 24.95, 18.99, 15.50, 22.00};

        System.out.println("Original array: " + Arrays.toString(costs));

        Arrays.sort(costs);

        double sum = 0;

        for (double cost : costs) {
            sum += cost;
        }

        double average = sum / costs.length;

        System.out.println("Sorted array: " + Arrays.toString(costs));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}