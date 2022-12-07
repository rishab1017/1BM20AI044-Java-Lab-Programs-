
class Retail {
	private String description;
	private int unit;
	private double price;

	Retail(String describe, int u, double p) {
		description = describe;
		unit = u;
		price = p;
	}

	String get_desc() {
		return desc;
	}

	int get_unit() {
		return unit;
	}

	double get_price() {
		return price;
	}
}

class test {
	public static void main(String args[]) {
		Retail r1 = new Retail("Shoes", 4, 500.00);
		Retail r2 = new Retail("Hand Bag", 2, 2500.00);
		Retail r3 = new Retail("Pens", 50, 10.00);

		System.out.println("Item details are:");
		System.out.println("Description:" + r1.get_desc());
		System.out.println("Unit:" + r1.get_unit());
		System.out.println("Price:\t" + r1.get_price());

		System.out.println("Item details are:");
		System.out.println("Description:" + r2.get_desc());
		System.out.println("Unit:" + r2.get_unit());
		System.out.println("Price:\t" + r2.get_price());

		System.out.println("Item details are:");
		System.out.println("Description:" + r3.get_desc());
		System.out.println("Unit:" + r3.get_unit());
		System.out.println("Price:" + r3.get_price());
	}
}
