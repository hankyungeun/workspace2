package day03.Practice;

public class GoodsApp {

	public static void main(String[] args) {
		Goods cup = new Goods("컵");

		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);

		System.out.println("상품이름 : " + camera.getName());
		System.out.println("값 : " + camera.getPrice());
		System.out.println("재고개수 : " + camera.getCountStock());
		System.out.println("팔린개수 : " + camera.getCountSold());
	}

}
