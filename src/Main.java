import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        final int c = 2;
        for (double i = a; i <= n; i++) {
            for (double j = a; j <= n; j++) {
                if (i == c) {
                    System.out.print("Помилка: ділення на 0");
                    return;
                } else {
                    s += (i + j) / (i - c);
                }
            }
        }
        System.out.print("S="+s);
    }


}

