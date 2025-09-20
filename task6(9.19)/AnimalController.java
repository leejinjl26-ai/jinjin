package task6;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AnimalController {
    private final Scanner sc = new Scanner(System.in);
    private final AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    public void run() {
        while (true) {
            System.out.println("\n[동물 병원 환자 관리 시스템]");
            System.out.println("번호 입력: 1-등록 / 2-조회 / 0-프로그램 종료");
            System.out.print("> ");

            int menu;
            try {
                menu = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력하세요.");
                sc.nextLine(); // 잘못 입력한 토큰 비우기
                continue;
            }
            sc.nextLine(); // 개행 제거

            switch (menu) {
                case 1:
                    register();
                    break;
                case 2:
                    listAll();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴를 다시 선택하세요.");
            }
        }
    }

    private void register() {
        System.out.print("아이디: ");
        String id = sc.nextLine().trim();

        System.out.print("보호자명: ");
        String owner = sc.nextLine().trim();

        System.out.print("반려 동물명: ");
        String petName = sc.nextLine().trim();

        int age = 0;
        while (true) {
            System.out.print("반려 동물 나이(숫자): ");
            try {
                age = sc.nextInt();
                sc.nextLine(); // 개행 제거
                break;
            } catch (InputMismatchException e) {
                System.out.println("숫자로 입력하세요.");
                sc.nextLine(); // 잘못된 입력 버리기
            }
        }

        System.out.print("연락처: ");
        String contact = sc.nextLine().trim();

        service.register(id, owner, petName, age, contact);
        System.out.println("등록 완료!");
    }

    private void listAll() {
        List<AnimalDTO> list = service.getAll();
        if (list.isEmpty()) {
            System.out.println("등록된 데이터가 없습니다.");
            return;
        }
        System.out.println("\n[전체 조회]");
        for (AnimalDTO dto : list) {
            System.out.println(dto);
        }
    }


}
