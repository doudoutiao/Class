package day011;

public class GoodsPrice {

	public static void main(String[] args) {

		Factory factory = new Factory();
		Goods goods = factory.getGoods("Tvs");
		goods.price();

	}
}

class Factory {
	public Goods getGoods(String goods) {
		if ("Tvs".equals(goods)) {
			return new Tvs(5999, "看电视");
		} else
			return new Foods(200, "吃东西");
	}

}

class Goods {
	private int price;
	private String function;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public Goods(int price, String function) {
		this.function = function;
		this.price = price;

	}

	public void price() {

	}

}

class Tvs extends Goods {
	public Tvs(int price, String function) {
		super(price, function);
	}

	public void price() {
		System.out.println("电视有" + getFunction() + "的功能,价格是" + getPrice());

	}

}

class Foods extends Goods {
	public Foods(int price, String function) {
		super(price, function);
	}

	public void price() {
		System.out.println("食物有" + getFunction() + "的功能,价格是" + getPrice());

	}

}