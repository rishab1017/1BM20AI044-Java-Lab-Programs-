import java.util.*;
import java.lang.*;

class compute
{
float c;
int a,b;

compute(int a, int b)
{
this.a=a;
this.b=b;
}

void add()
{
c= a+b;
System.out.println(c);
}

void subtract()
{
c= a-b;
System.out.println(c);
}

void multiply()
{
c= a*b;
System.out.println(c);
}

void divide()
{
try
{
c=a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println("b=0");                                                                                                                                                                                               
}

}
}



class Calculator
{
public static void main(String args[])
{
int a,b,o;
                                                                                                                                                                                                                                                                                                                  
Scanner sc=new Scanner(System.in);


while(true)
{
System.out.println("1.Add 2.Subt 3. Mul 4.Divide 5.Exit");
o=sc.nextInt();
switch(o)
{


case 1:

System.out.println("Enter a and b values");
a=sc.nextInt();
b=sc.nextInt();

compute C=new compute(a,b);
 C.add();
break;

case 2:

System.out.println("Enter a and b values");
a=sc.nextInt();
b=sc.nextInt();

compute D=new compute(a,b);
D.subtract();

break;
case 3:

System.out.println("Enter a and b values");
a=sc.nextInt();
b=sc.nextInt();

compute E=new compute(a,b);
E.multiply();

break;
case 4:

System.out.println("Enter a and b values");

a=sc.nextInt();
b=sc.nextInt();

compute F=new compute(a,b);
 F.divide();

break;

case 5:
System.exit(0);

default: System.out.println("Enter a valid choice");
}
}

}
}
