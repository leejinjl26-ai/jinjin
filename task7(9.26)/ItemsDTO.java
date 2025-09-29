package ch4;

import java.text.DecimalFormat;

/*
 * 1. 아이템번호(자동부여)
 * 2. 아이템명
 * 3. 수량
 * 4. 가격
 * 5. 합계
 */
public class ItemsDTO {
	private int id;			// 상품번호(자동증가)
	private String name;    // 상품명
	private int qty;        // 수량
	private int price;      // 가격
	private int total;      // 합계 = qty * price;
	
	public ItemsDTO() {	}
	
	public ItemsDTO(int id, String name, int qty, int price) {
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.total = qty * price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
		setTotal();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		setTotal();
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		this.total = this.qty * this.price;
	}

	DecimalFormat df = new DecimalFormat("#,###");
	
	@Override
	public String toString() {
		return String.format("번호:%d | 상품명:%s | 수량:%d개 | 가격:%s원 | 합계:%s원",id, name, qty, df.format(price), df.format(total));
	}
	
	
	
	
}
