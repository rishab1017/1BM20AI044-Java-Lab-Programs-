class Temperature {
    private double temp;

    public Temperature(double temp) {
        this.temp = temp;
    }

    public void checkTemp() {
        try {
            if (temp == 0) {
                throw new IllegalArgumentException("Temperature cannot be zero.");
            }
            System.out.println("Temperature is valid.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Temp {
    public static void main(String[] args) {
        Temperature t = new Temperature(0);
        System.out.println("Checking temperature...");
        t.checkTemp();
    }
}
