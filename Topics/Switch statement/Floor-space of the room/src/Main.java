import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double a;
        double b;
        double c;
        double r;
        double p;
        double pi = 3.14;

        switch (scanner.nextLine()) {
            case "triangle": {
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            }
            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a * b);
                break;
            case "circle":
                r = scanner.nextInt();
                System.out.println(r * r * pi);
                break;
            default:
                break;
        }
    }
}