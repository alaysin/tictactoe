import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        int contains = scanner.nextInt();
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (ints[i] == contains) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}