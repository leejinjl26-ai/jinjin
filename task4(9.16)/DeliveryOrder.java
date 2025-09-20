package task4;

public class DeliveryOrder {

    String food;   
    String address; 

  
    public DeliveryOrder(String food, String address) {
        this.food = food;
        this.address = address;
    }

  
    public void deliver() {
        System.out.println(food + "를 " + address + "에 배달합니다!");
    }
}