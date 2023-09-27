import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int c = 2;
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть a:");
        int a;
        try {
            a = in.nextInt();
        } catch (Exception ex) {
            System.out.print("Змінна а повинна бути цілим числом");
            return;
        }
        System.out.print("Введіть n:");
        int n;
        try {
            n = in.nextInt();
        } catch (Exception ex) {
            System.out.print("Змінна n повинна бути цілим числом");
            return;
        }
        if (n <= a) {
            System.out.print("Змінна n повинна бути більше від a");
            return;
        }
        if (a <= c && n >= c) {
            System.out.println("Ділення на нуль");
            return;
        }
        System.out.print("Введіть b:");
        int b;
        try {
            b = in.nextInt();
        } catch (Exception ex) {
            System.out.print("Змінна b повинна бути цілим числом");
            return;
        }
        System.out.print("Введіть m:");
        int m;
        try {
            m = in.nextInt();
        } catch (Exception ex) {
            System.out.print("Змінна m повинна бути цілим числом");
            return;
        }
        if (m <= b) {
            System.out.print("Змінна m повинна бути більше від b");
            return;
        }
        double s = 0;

        for (double i = a; i <= n; i++) {
            for (double j = a; j <= n; j++) {
                s += (i + j) / (i - c);
            }
        }
        System.out.print("S=" + s);
    }
}

