package task2;
import java.util.Scanner;
public class hw0912Q10 {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("첫 번째 주사위 숫자를 입력하세요 (1~6): ");
	        int dice1 = sc.nextInt();

	        System.out.print("두 번째 주사위 숫자를 입력하세요 (1~6): ");
	        int dice2 = sc.nextInt();

	        int sum = dice1 + dice2;

	        System.out.println("첫 번째 주사위: " + dice1);
	        System.out.println("두 번째 주사위: " + dice2);
	        System.out.println("두 수의 합: " + sum);

	        sc.close();
	    }
	}