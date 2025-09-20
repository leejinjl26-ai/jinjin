package task;

import java.util.Scanner;

public class day0911hw8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("오늘 마신 커피 수를 입력하세요: ");
        int coffee = sc.nextInt();

        if (coffee == 0) {
            System.out.println("여긴 어디? 😵");
        } else if (coffee >= 1 && coffee < 3) {
            System.out.println("완전 맑은 정신~ 🍀");
        } else {
            System.out.println("기분 좋은 상태! 😄");
        }

        sc.close();
    }
}
