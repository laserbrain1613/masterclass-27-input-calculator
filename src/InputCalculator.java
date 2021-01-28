import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int sum = 0, count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                scanner.nextLine();
                count++;
            } else {
                break;
            }
        }

        count = (count == 0) ? 1 : count; // Prevents division by zero

        long average = Math.round((double) sum / count) ;
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

}