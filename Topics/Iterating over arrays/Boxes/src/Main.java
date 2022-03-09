import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        final int borderlinecount = 3;
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[borderlinecount];
        int[] y = new int[borderlinecount];
        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = scanner.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);

        boolean x1 = false;
        boolean x2 = false;
        boolean x3 = false;
        boolean incompatible = false;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == y[i]) {
                incompatible = true;
                break;
            }
        }
        if (x[0] > y[0]) {
            x1 = true;
        }
        if (x[1] > y[1]) {
            x2 = true;
        }
        if (x[2] > y[2]) {
            x3 = true;
        }

        if (incompatible) {
            System.out.println("Incompatible");
        } else if (x1 && x2 && x3) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Box 1 < Box 2");
        }
    }
}