import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long number = scanner.nextLong();
        long x = 1;
        int counter = 1;

        while (x <= number) {
            counter++;
            x = x * counter;
        }
        System.out.println(counter);
    }
}