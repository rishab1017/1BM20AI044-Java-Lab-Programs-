package test;

public class Student_B extends Marks{
	public int Sub1, Sub2, Sub3, Sub4;
	public double sum,per;
	
	public Student_B(int s1, int s2, int s3, int s4) {
		Sub1 = s1;
		Sub2 = s2;
		Sub3 = s3;
		Sub4 = s4;
		
	}
	
	public void getPercentage() {
		
		sum = (Sub1+Sub2+Sub3+Sub4) ;
		per = sum/4;
		System.out.println("The percentage of StudentB is: "+ per );
		
	}
	
	
}
