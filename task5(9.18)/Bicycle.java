package task5;

public class Bicycle implements Vehicle {
    private int speed;

    // getter & setter
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("자전거가 달리고 있습니다 속도: " + speed + " km/h");
    }
}
