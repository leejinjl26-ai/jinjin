package task2;

import java.util.Scanner;

public class hw0912Q06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		     
		System.out.print("숫자를 입력하세요(1~9)");
        int a= sc.nextInt();
		
	        for (int i = 1; i <= 9; i++) {
	            System.out.println(a + " x "  + i + " = " + (a * i));
	        }
	        
	        
	        sc.close();
	}

}
