package task;

import java.util.Scanner;

public class day0911hw3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("좋아하는 동물 이름은?");
        String animal = sc.nextLine();  // 문자열 입력 받기
        
        if (animal.equals("강아지")) {
            System.out.println("멍멍");
            
        } else if (animal.equals("고양이")) {
            System.out.println("야옹");
        
        } else {
            System.out.println("무슨 동물이야?");
        }

        sc.close();
    }
}
