package task3;

import java.util.Random;
import java.util.Scanner;

public class hw0915Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

				
				
			Random ran = new Random();

			int fortune = ran.nextInt(101);
		

			
			System.out.println("당신과 그 사람의 이름을 적어주세요.");
			String you = sc.nextLine();  
	        String love = sc.nextLine(); 
			

			System.out.println( you + "와 " + love + "의 연애성공확률: " + fortune + "%");


		}

}
