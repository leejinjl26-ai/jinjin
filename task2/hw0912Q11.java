package task2;
import java.util.Scanner;
public class hw0912Q11 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = 30;  // 정답 숫자를 직접 지정 (예: 30)

        int guess = 0;    // 사용자가 입력한 값 저장할 변수

        System.out.println("1~50 사이의 숫자를 맞춰보세요!");

        while (guess != target) {
            System.out.print("숫자를 입력하세요: ");
            guess = sc.nextInt();

            if (guess < target) {
                System.out.println("UP");
            } else if (guess > target) {
                System.out.println("DOWN");
            } else {
                System.out.println("정답! 🎉");
            }
        }

        sc.close();
    }

	}

