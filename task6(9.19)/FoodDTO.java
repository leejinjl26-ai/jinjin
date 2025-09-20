package task6;

import java.time.LocalDate;

public class FoodDTO {
    private String itemNo;       // 식자재번호
    private String itemName;     // 식자재명
    private int quantity;        // 수량
    private LocalDate regDate;   // 등록날짜

    public FoodDTO() {}

    public FoodDTO(String itemNo, String itemName, int quantity, LocalDate regDate) {
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.quantity = quantity;
        this.regDate = regDate;
    }

    public String getItemNo() { return itemNo; }
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public LocalDate getRegDate() { return regDate; }

    public void setItemNo(String itemNo) { this.itemNo = itemNo; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setRegDate(LocalDate regDate) { this.regDate = regDate; }

    @Override
    public String toString() {
        return "[식자재번호=" + itemNo +
               ", 식자재명=" + itemName +
               ", 수량=" + quantity +
               ", 등록날짜=" + regDate + "]";
    }
}