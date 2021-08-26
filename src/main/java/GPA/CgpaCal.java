package GPA;

public class CgpaCal {
	public static double calc(double[] marks, int n) {
		double grade[]= new double[n];
		double cgpa, sum=0;
		for(int i=0;i<n;i++)
		{
			grade[i]= (marks[i]/n);
			
		}
		for(int i=0;i<n;i++)
		{
			sum = grade[i];
			
		}
cgpa=sum/n;
return cgpa;
	}
		
		
		
		
	}

