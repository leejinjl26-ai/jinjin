package task;

import java.util.Scanner;

public class day0911hw5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("요일숫자를 입력하세요 (0=일, 1=월, ... 6=토): ");
		int day = sc.nextInt();
		
		if (day == 6 || day == 0)
			System.out.println("주말이야!");
		else
			System.out.println("평일이야!");

		sc.close();
	}
}
