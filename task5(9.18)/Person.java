package task5;

public class Person {
	    private String name;  // 외부에서 접근 불가
	    private int age;      // 외부에서 접근 불가

	    // setter
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }

	    // getter
	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }
	}