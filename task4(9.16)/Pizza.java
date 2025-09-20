package task4;

public class Pizza {
	String type;
	String size;

	public Pizza(String type, String size) {
		super();
		this.type = type;
		this.size = size;
	}

	void showInfo() {
		System.out.println("피자 종류: " + type + ", 사이즈: " + size);
	}

}
