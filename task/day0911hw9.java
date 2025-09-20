package task;

import java.util.Scanner;

public class day0911hw9 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("숫자를 입력하세요: ");
	        int num = sc.nextInt();

	        if (num % 2 == 0) {       // 나머지가 0이면 짝수
	            System.out.println("짝수입니다.");
	        }
	        if (num % 2 == 1) {       // 나머지가 1이면 홀수
	            System.out.println("홀수입니다.");
	        }

	        sc.close();
	    }
	}