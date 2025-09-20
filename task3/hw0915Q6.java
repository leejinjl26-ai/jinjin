package task3;

import java.util.Scanner;

public class hw0915Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 적어주세요 : ");
        int score = sc.nextInt();  // 사용자가 입력한 점수

        String result = ""; // 결과 저장 변수

        if(score >= 0 && score <= 100) {
            switch (score / 10) { // 점수를 10으로 나눈 몫
                case 10: // 100점
                case 9:  result = "A"; break; // 90~99
                case 8:  result = "B"; break; // 80~89
                case 7:  result = "C"; break; // 70~79
                case 6:  result = "D"; break; // 60~69
                default: result = "F";        // 0~59
            }
            System.out.println("등급은 " + result + "입니다.");
        } else {
            System.out.println("점수는 0~100 사이만 입력 가능합니다.");
        }

        sc.close(); 
    }
}
