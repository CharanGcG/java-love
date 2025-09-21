import java.util.Arrays;

public class ArrayMinMaxSumAvg {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};

        int maxi = numbers[0];
        int mini = numbers[0];
        int sum = 0;

        for (int num: numbers) {
            if (num < mini) mini = num;
            if (num > maxi) maxi = num;
            sum += num;
        }

        double avg = (double) sum / numbers.length; // Explicit type casting required

        System.out.println("Aggregrate functions custom: \nMaximum: " + maxi + "\nMinimum: " + mini + "\nSum: " + sum + "\nAverage: " + avg);
    }
}