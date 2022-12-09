package test;

public class Student_A extends Marks{
	public int Sub1;
	public int Sub2;
	public int Sub3;
	public double sum,per;

	
	public Student_A(int s1, int s2, int s3) {
		
		Sub1=s1;
		Sub2=s2;
		Sub3=s3;
	}
	public void getPercentage() {
		sum = (Sub1+Sub2+Sub3);
		per = sum/3;
		System.out.println("The percentage of StudentA is: "+ per );

		
	}
}

