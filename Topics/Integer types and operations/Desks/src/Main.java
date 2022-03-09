import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int a1 = a % 2 == 0 ? a / 2 : a / 2 + 1;
        int b1 = b % 2 == 0 ? b / 2 : b / 2 + 1;
        int c1 = c % 2 == 0 ? c / 2 : c / 2 + 1;
        int d = a1 + b1 + c1;
        System.out.println(d);
    }
}