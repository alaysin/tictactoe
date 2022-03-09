import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        boolean stop = false;
        int intSum = 0;

        while (!stop) {
            int newInteger = scanner.nextInt();
            intSum = intSum + newInteger;
            if (newInteger == 0) {
                System.out.println(intSum);
                break;
            }
            if (intSum >= 1000) {
                System.out.println(intSum - 1000);
                break;
            }

        }
    }
}