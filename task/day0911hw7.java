package task;

import java.util.Scanner;

public class day0911hw7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 적어주세요: ");
        int adult = sc.nextInt();

        if (adult >= 19) {
            System.out.println("성인입니다");
        } else {
            System.out.println("미성년입니다");
        }

        sc.close();
    }
}
