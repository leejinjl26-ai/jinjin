package task6;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class HealthController {
    private final Scanner sc = new Scanner(System.in);
    private final HealthService service;

    public HealthController(HealthService service) {
        this.service = service;
    }

    public void run() {
        while (true) {
            System.out.println("\n[체육센터 건강관리 시스템]");
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
        System.out.print("회원명: ");
        String name = sc.nextLine().trim();

        int no = readInt("회원번호(숫자): ");
        int base = readInt("기준칼로리(숫자): ");
        int burn = readInt("소비칼로리(숫자): ");

        service.register(name, no, base, burn);
        System.out.println("등록 완료!");
    }

    private int readInt(String label) {
        while (true) {
            System.out.print(label);
            try {
                int v = sc.nextInt();
                sc.nextLine();
                return v;
            } catch (InputMismatchException e) {
                System.out.println("숫자로 입력하세요.");
                sc.nextLine();
            }
        }
    }

    private void listAll() {
        List<HealthDTO> list = service.getAll();
        if (list.isEmpty()) {
            System.out.println("등록된 데이터가 없습니다.");
            return;
        }
        System.out.println("\n[전체 조회]");
        for (HealthDTO dto : list) {
            System.out.println(dto);
        }
    }
}