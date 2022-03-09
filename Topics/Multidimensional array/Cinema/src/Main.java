import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] theater = new int[n][m];

        for (int i = 0; i < theater.length; i++) {
            for (int j = 0; j < theater[i].length; j++) {
                theater[i][j] = scanner.nextInt();
            }
        }

        int quantity = scanner.nextInt();
        int counter = 0;
        boolean stop = false;

        for (int i = 0; i < theater.length; i++) {
            if (!stop) {
                for (int j = 0; j < theater[i].length; j++) {
                    if (theater[i][j] == 0) {
                        counter++;
                        if (counter == quantity) {
                            System.out.println(i + 1);
                            stop = true;
                            break;
                        }
                    } else {
                        counter = 0;
                    }
                }
                if (counter == quantity) {
                    break;
                }
            }
            counter = 0;
        }
        if (counter != quantity) {
            System.out.println(0);
        }
    }
}
