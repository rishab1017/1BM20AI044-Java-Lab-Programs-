

class A {
	private int a1, a2;
	public int b1, b2;
	protected double f1, f2;

	A() {
		a1 = 2;
		a2 = 7;
		f1 = 6.5;
		f2 = 5.4;
		b1 = 4;
		b2 = 9;
	}

	A(int x, int y) {
		a1 = x;
		a2 = y;
	}

	void display() {
		System.out.println("This is inside class A");
	}

	final void print_data() {
		System.out.println("Private Data members value: a1=" + a1 + " a2=" + a2);
	}
}

class B extends A {
	B() {
		super();
	}

	void display() {
		System.out.println("This is inside class B");
	}

	void data() {
		System.out.println("Value of Protected Data Members: f1=" + f1 + " f2=" + f2);
		System.out.println("Value of Public Data Members: b1=" + b1 + " b2=" + b2);
	}
}

class C extends B {
	C() {
		super();
	}

	void display() {
		System.out.println("This is inside class C");
	}
}

final class D extends B {
	D() {
		super();
	}

	void display() {
		System.out.println("This is inside class D");
	}
}

class demo {
	public static void main(String args[]) {
		D d = new D();
		C c = new C();
		System.out.println("Class D:");
		d.display();
		d.data();
		System.out.println("Class C:");
		c.display();
		c.data();
	}
}
