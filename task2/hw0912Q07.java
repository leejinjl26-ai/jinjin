package task2;

import java.util.Scanner;

public class hw0912Q07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요");
        int a= sc.nextInt();
        
        if(a % 3 == 0) {
        	System.out.println("점프!");
        	
        } else {
        	
        	System.out.println("패스!");
        	
        }
		
	        
	        sc.close();
		

	}

}
