import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (h >= a && h <= b) {
            System.out.println("Normal");
        } else if (h >= b) {
            System.out.println("Excess");
        } else {
            System.out.println("Deficiency");
        }
    }
}