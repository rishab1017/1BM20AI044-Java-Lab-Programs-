package gcdNum;
public class gcd {
    public void show()
    {
        int a = 9, b = 3;
        System.out.println("GCD of " + a +" and " + b + " is " + findGCD(a, b));
    }
    //recursive function to return gcd of a and b
    static int findGCD(int a, int b)
    {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}
