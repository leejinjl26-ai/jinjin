package task4;

public class KedehunMain {

	public static void main(String[] args) {

		Kedehun idol1 = new Kedehun("조이", "메인래퍼", "헌트릭스");
		Kedehun idol2 = new Kedehun("루미", "메인보컬", "헌트릭스");
		Kedehun idol3 = new Kedehun("미라", "메인댄서", "헌트릭스");

		Kedehun idol4 = new Kedehun("진우", "메인보컬", "사자보이즈");
		Kedehun idol5 = new Kedehun("미스터리", "서브보컬", "사자보이즈");
		Kedehun idol6 = new Kedehun("베이비", "메인래퍼", "사자보이즈");
		Kedehun idol7 = new Kedehun("애비", "메인댄서", "사자보이즈");
		Kedehun idol8 = new Kedehun("로맨스", "리드보컬", "사자보이즈");
		
		System.out.println("이름: " + idol1.name + ", 포지션: " + idol1.position + ", 그룹: " + idol1.group);

	}
}
