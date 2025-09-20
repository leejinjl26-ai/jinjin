package task2;

import java.util.Scanner;

public class hw0912Q02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
				System.out.println("스쿼트 몇 번 할까요?");
		
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			
			System.out.println("스쿼트 " + i + "회 완료"); 
		
		}
		sc.close();
		
		System.out.println("오늘 운동 끝");
	}

}
