package task6;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FoodController {
    private final Scanner sc = new Scanner(System.in);
    private final FoodService service;

    public FoodController(FoodService service) {
        this.service = service;
    }

    public void run() {
        while (true) {
            System.out.println("\n[국제사회교육원 식자재 관리 시스템]");
            System.out.println("번호 입력: 1-등록 / 2-조회 / 0-프로그램 종료");
            System.out.print("> ");

            int menu;
            try {
                menu = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력하세요.");
                sc.nextLine();
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
        System.out.print("식자재번호: ");
        String no = sc.nextLine().trim();

        System.out.print("식자재명: ");
        String name = sc.nextLine().trim();

        int qty = 0;
        while (true) {
            System.out.print("수량(숫자): ");
            try {
                qty = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("숫자로 입력하세요.");
                sc.nextLine();
            }
        }

        LocalDate date = null;
        while (true) {
            System.out.print("등록날짜(YYYY-MM-DD): ");
            String s = sc.nextLine().trim();
            try {
                date = LocalDate.parse(s);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("형식이 올바르지 않습니다. 예: 2025-09-20");
            }
        }

        service.register(no, name, qty, date);
        System.out.println("등록 완료!");
    }

    private void listAll() {
        List<FoodDTO> list = service.getAll();
        if (list.isEmpty()) {
            System.out.println("등록된 데이터가 없습니다.");
            return;
        }
        System.out.println("\n[전체 조회]");
        for (FoodDTO dto : list) {
            System.out.println(dto);
        }
    }
}