package task3;

import java.util.Scanner;

public class hw0915Q3 {

	public static int kcal(int x) {
		return 200 * x;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("삼각김밥을 몇 개 먹었나요?");
		int samgim = sc.nextInt();

		System.out.println(kcal(samgim) + "kcal");

	}

}
