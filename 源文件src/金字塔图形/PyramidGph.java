import java.util.Scanner;

public class PyramidGph {
    public static void main(String[] args) {
        int i, j, k, n;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入金字塔层数：");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++)
                System.out.printf(" ");
            for (k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}