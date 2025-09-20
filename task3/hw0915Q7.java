package task3;

import java.util.Scanner;

public class hw0915Q7 {

    // 시급과 일한 시간으로 계산 
    public static int getPay(int money, int hour) {
        return money * hour;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시급을 입력하세요: ");
        int money = sc.nextInt(); // 시급 입력 받기

        System.out.print("일한 시간을 입력하세요: ");
        int hours = sc.nextInt(); // 시간 입력 받기

     
        int result = getPay(money, hours);

        System.out.println("총 급여: " + result + "원");

        sc.close(); 
    }
}

