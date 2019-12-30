package pl.pjatk.tdd.arrays;

public class ArraysStatistics {
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;

    }

    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }

    public static double avg(int[] numbers) {
        int Sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            Sum = Sum + numbers[i];
        }
        return (double)Sum/(double)numbers.length;
    }

    public static int sum(int[] numbers) {
        int Sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            Sum = Sum + numbers[i];
        }
        return Sum;
    }


}
