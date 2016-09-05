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
			return new Tvs(5999, "������");
		} else
			return new Foods(200, "�Զ���");
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
		System.out.println("������" + getFunction() + "�Ĺ���,�۸���" + getPrice());

	}

}

class Foods extends Goods {
	public Foods(int price, String function) {
		super(price, function);
	}

	public void price() {
		System.out.println("ʳ����" + getFunction() + "�Ĺ���,�۸���" + getPrice());

	}

}