import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();
        int counter = 0;


        while ((int) m < (int) k) {
            counter++;
            m = m + m * p / 100;
        }
        System.out.println(counter);

    }
}