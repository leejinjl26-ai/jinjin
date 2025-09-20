package task5;

public class BookMain {

	public static void main(String[] args) {
		TextBook tb = new TextBook();
        tb.setTitle("자바 세상 어려움");
        tb.setAuthor("이진");
        tb.setPrice(25000);
        tb.setSubject("컴퓨터공학");

        // 소설 객체 생성
        Novel nv = new Novel();
        nv.setTitle("해리포터");
        nv.setAuthor("J.K. 롤링");
        nv.setPrice(18000);
        nv.setGenre("판타지");

        // 출력
        System.out.println("=== 전공서적 정보 ===");
        tb.printInfo();

        System.out.println("\n=== 소설 정보 ===");
        nv.printInfo();

	}

}
