package task2;

import java.util.Scanner;

public class hw0912Q03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("두 개의 숫자를 입력해주세요");

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		sc.close();

	}

}
