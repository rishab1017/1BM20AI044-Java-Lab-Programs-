import java.util.*;
import java.lang.*;

class ArrayOutOfBound
{
public static void main(String args[])
{
int n,p;
Scanner sc= new Scanner(System.in);
System.out.println("Enter your array size");
n=sc.nextInt();
int A[]=new int[n];
System.out.println("Enter your array values");

for (int j=0;j<n;j++)
{
A[j]=sc.nextInt();
}

try
{
System.out.println("Enter your index value");
p=sc.nextInt();
System.out.println(A[p]);
}
catch(IndexOutOfBoundsException e)
{
System.out.println("Invalid index value");
}
}
}
