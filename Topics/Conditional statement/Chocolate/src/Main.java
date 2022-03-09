import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if (n * m - k > 0) {
            if ((n * m - k) % n == 0 || (n * m - k) % m == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }


        // 3*3 = 9 // 6
        // 7 * 4 = 28 // 21
        // 5 * 12 = 60 //100
    }
}