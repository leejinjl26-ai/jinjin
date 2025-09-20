package task5;

public class VehicleMain {

	public static void main(String[] args) {


		
		Car car = new Car();
        car.setSpeed(120); // move 전에 반드시 setter로 조작
        car.move();
        System.out.println("자동차 현재 속도: " + car.getSpeed() + " km/h");
        
        Bicycle bicycle = new Bicycle();
        bicycle.setSpeed(30);
        bicycle.move();
        System.out.println("자전거 현재 속도: " + bicycle.getSpeed() + " km/h");
    }
}
