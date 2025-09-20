package task2;

import java.util.Scanner;

public class hw0912Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 치킨 주문 알림기
		// 주문 들어온 치킨의 수만큼 “치킨 1마리 주문이요”, “치킨 2마리주문이요”, … “치킨 n마리 주문이요”
		
		System.out.println("치킨 몇 마리를 주문하시나요?");

		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			
			System.out.println("치킨" + i + "마리 주문이요"); 
		}
		sc.close();
				}

	}

