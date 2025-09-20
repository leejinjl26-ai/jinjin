package task3;

import java.util.Scanner;

public class hw0915Q1 {

	public static int pieces(int x) {
		return 8 * x;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("치킨은 몇 마리인가요?");
		int chicken = sc.nextInt();

		System.out.println(pieces(chicken) + "조각");

	}

}
