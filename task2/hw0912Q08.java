package task2;

import java.util.Scanner;

public class hw0912Q08 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("정수를 입력하세요: ");
	        int n = sc.nextInt();   // 한 줄에 별의 개수

	     
	        for (int i = 1; i <= n; i++) {
	            
	            for (int j = 1; j <= n; j++) {
	                System.out.print("*");  // 줄바꿈 없이 별 찍기
	            }
	            System.out.println();  // 한 줄 끝나면 줄바꿈
	        }

	        sc.close();
	    }
	
	}