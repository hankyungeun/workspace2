package day03.Practice;

import lombok.Data;

@Data
public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public Goods() {
	}

	public Goods(String name) {
		this.name = name;
	}

	public Goods(String name, int price) {
		// this.name = name;
		this(name);
		this.price = price;
	}

	public Goods(String name, int price, int countStock, int countSold) {
		// this.name = name;
		// this.price = price;
		this(name, price);
		this.countStock = countStock;
		this.countSold = countSold;
	}
}
