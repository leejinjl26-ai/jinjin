package task3;

import java.util.Random;

public class hw0915Q5 {

	public static void main(String[] args) {

		Random ran = new Random();

		String[] food = { "라면", "김밥", "파스타","샐러드" };
		int idx = ran.nextInt(food.length);

		System.out.println("오늘의 메뉴: " + food[idx]);

	}

}