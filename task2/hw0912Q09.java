package task2;
import java.util.Scanner;
public class hw0912Q09 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    

        System.out.print("피자 조각 개수를 입력하세요: ");
        int pizza = sc.nextInt();

        System.out.print("사람 수를 입력하세요: ");
        int people = sc.nextInt();

        int share = pizza / people;  // 한 사람당 먹는 조각 수
        int remain = pizza % people; // 남는 조각 수

        System.out.println("한 사람당 " + share + "조각 먹을 수 있습니다.");
        System.out.println("남는 조각은 " + remain + "개 입니다.");

        sc.close();
    }
}