package task3;
import java.util.Scanner;
public class hw0915Q0 {

	public static void main(String[] args) {
	       boolean run = true;      
	        int balance = 0;
	        Scanner scanner = new Scanner(System.in);

	        while(run) {
	            System.out.println("-----------------------------------");
	            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
	            System.out.println("-----------------------------------");
	            System.out.print("선택> "); 

	            int menu = scanner.nextInt(); 

	            switch(menu) {
	                case 1: // 예금
	                    System.out.print("입금액을 입력하세요: ");
	                    int deposit = scanner.nextInt();
	                    balance += deposit; 
	                    System.out.println(deposit + "원 입금되었습니다.");
	                    break;

	                case 2: // 출금
	                    System.out.print("출금액을 입력하세요: ");
	                    int withdraw = scanner.nextInt();
	                    if (withdraw > balance) {
	                        System.out.println("잔고보다 커서 출금할 수 없습니다.");
	                    } else {
	                        balance -= withdraw;
	                        System.out.println(withdraw + "원 출금되었습니다.");
	                    }
	                    break;

	                case 3: // 잔고 조회
	                    System.out.println("잔고: " + balance + "원");
	                    break;

	                case 4: // 종료
	                    run = false;
	                    break;

	                default: 
	                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
	            }
	        }

	        System.out.println("프로그램 종료");    
	        scanner.close(); 
	    }
	}