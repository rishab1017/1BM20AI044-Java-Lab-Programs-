class Car {
	int model;
	String make;
	int speed;

	Car(int mod, String made, int v) {
		model = mod;
		make = made;
		speed = v;
	}

	void display() {
		System.out.println("Car Details");
		System.out.println("Car model:" + model);
		System.out.println("Car make:" + make);
		System.out.println("Car speed:" + speed);
	}

	int accelerate() {
		speed = speed + 10;
		return speed;
	}

	int brake() {
		speed = speed - 10;
		return speed;
	}
}

class test1 {
	public static void main(String args[]) {
		Car c = new Car(2018, "Ferrari", 100);
		c.display();
		System.out.println("\nNew speed after acceleration: " + c.accelerate());
		System.out.println("\nNew speed after acceleration: " + c.accelerate());
		System.out.println("\nNew speed after acceleration: " + c.accelerate());
		System.out.println("\nNew speed after acceleration: " + c.accelerate());
		System.out.println("\nNew speed after acceleration: " + c.accelerate());

		System.out.println("\nNew speed after brake: " + c.brake());
		System.out.println("\nNew speed after brake: " + c.brake());
		System.out.println("\nNew speed after brake: " + c.brake());
		System.out.println("\nNew speed after brake: " + c.brake());
		System.out.println("\nNew speed after brake: " + c.brake());
	}
}
