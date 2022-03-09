import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int seq = scanner.nextInt();
        sequence(seq);
    }

    public static void sequence(int sequence) {
        int counter = 0;
        for (int i = 1; i <= sequence; i++) {
            for (int j = 0; j < i; j++) {
                if (counter < sequence) {
                    System.out.println(i);
                }
                counter++;
            }
        }
    }
}