import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        int[] array = new int[data];
        for (int i = 0; i < data; i++) {
            array[i] = scanner.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < data - 2; i++) {
            if (array[i] + 1 == array[i + 1]
                    && array[i] + 2 == array[i + 2]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}