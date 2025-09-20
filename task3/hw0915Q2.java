package task3;

import java.util.Scanner;

public class hw0915Q2 {

	public static int caffeine(int x) {
		return 80 * x;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("커피를 몇 잔 마시나요?");
		int coffee = sc.nextInt();

		System.out.println(caffeine(coffee) + "mg");

	}

}
