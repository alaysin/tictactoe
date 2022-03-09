import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String number = scanner.nextLine();

        int a = Character.getNumericValue(number.charAt(0))
                + Character.getNumericValue(number.charAt(1))
                + Character.getNumericValue(number.charAt(2));
        System.out.println(a);
    }
}