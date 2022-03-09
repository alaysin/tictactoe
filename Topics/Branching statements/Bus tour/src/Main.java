import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int hight = scanner.nextInt();
        int bridgesQuantity = scanner.nextInt();

        for (int i = 1; i <= bridgesQuantity; i++) {
            int bridgesHight = scanner.nextInt();

            if (bridgesHight <= hight) {
                System.out.println("Will crash on bridge " + i);
                break;
            } else if (bridgesQuantity == i) {
                System.out.println("Will not crash");
            }
        }
    }
}