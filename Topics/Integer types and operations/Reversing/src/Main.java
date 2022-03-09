import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int last = number / 100;
        int second = number / 10 % 10 * 10;
        int first = number % 10 * 100;
        System.out.println(first + second + last);
    }
}