package task2;

import java.util.Scanner;

public class hw0912Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = sc.nextInt();

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
