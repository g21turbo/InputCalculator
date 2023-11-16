import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long avg = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
                count++;
            } else {
                break;
            }
            if (count > 0) {
                avg = Math.round(sum / count);
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}