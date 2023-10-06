public class Main {
    public static void main(String[] args) {

        double[] numbers = {1.8, 2.9, -1.5, 2.3, 8.9, 7.3, 9.1, 6.8, -5.7, -6.3, -7.2, 3.2, 5.9, 6.6, -2.7};

        boolean negativeNumber = false;

        int positiveCount = 0;
        double positiveSum = 0.0;

        for (double number : numbers) {
            if (negativeNumber && number > 0) {
                positiveCount++;
                positiveSum += number;
            } else if (number < 0) {
                negativeNumber = true;
            }
        }
        if (positiveCount > 0) {
            double average = positiveSum / positiveCount;
            System.out.println("Количество положительны чисел: " + positiveCount);
            System.out.println("---------------");
            System.out.println("Сумма положительных чисел: " + positiveSum);
            System.out.println("---------------");
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
            System.out.println("---------------");
        } else {
            System.out.println("После первого отрицательного числа нет положительных чисел ");
            System.out.println("---------------");
        }

        for (int i = 0; i < numbers.length - 1; i++) {

            int minIndex = i;

            if (i > 12) {
                System.out.println("Отсортированный массив: ");
            }else {
                System.out.println("Текущее состояние массива: ");
            }

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;

            printArray(numbers);
        }
    }

    public static void printArray(double[] numbers) {

        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("---------------");
    }

}









