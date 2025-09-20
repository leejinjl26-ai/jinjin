package task;

import java.util.Scanner;

public class day0911hw1 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("비밀번호를 기입해주세요");
        String password = sc.nextLine();  // 문자열 입력 받기
        
        if (password.equals("qwer1234")) {
            System.out.println("비밀번호가 맞아요!");
        } else {
            System.out.println("비밀번호가 틀렸어요!");
        }

        sc.close();
    }
}
