import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int counter = 0;
        int square = 0;
        while (square < n) {
            counter++;
            square = counter * counter;
            if (square <= n) {
                System.out.println(square);
            }
        }
    }
}