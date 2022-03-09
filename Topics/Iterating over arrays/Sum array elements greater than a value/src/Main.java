import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int counter = 0;
        int[] ints = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            ints[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();

        for (int i = 0; i < arrayLength; i++) {
            if (ints[i] > n) {
                counter = counter + ints[i];
            }
        }
        System.out.println(counter);
    }
}