import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        maxElem(array, n, m);

    }

    public static void maxElem(int[][] array, int n, int m) {
        int elem = 0;
        int row = 0;
        int maxInt = array[0][0];
        if (n > 1 && m > 1) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m - 1; j++) {

                    if (maxInt < array[i + 1][j + 1]) {
                        maxInt = array[i + 1][j + 1];
                        elem = i + 1;
                        row = j + 1;
                    }
                }
            }
        } else if (n == 1 && m > 1) {
            for (int j = 0; j < m - 1; j++) {
                if (maxInt < array[0][j + 1]) {
                    maxInt = array[0][j + 1];
                    row = j + 1;
                }
            }
        } else if (n > 1 && m == 1) {
            for (int j = 0; j < n - 1; j++) {
                if (maxInt < array[j + 1][0]) {
                    maxInt = array[j + 1][0];
                    elem = j + 1;
                }
            }
        }
        System.out.println(elem + " " + row);
    }
}