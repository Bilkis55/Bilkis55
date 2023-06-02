
//8.Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.

import java.util.Scanner;
public class Average
{
     public void data()
     {
	int a,b,c,sum;
	float avg;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your numbers:-");
	
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	
	sum=a+b+c;
	avg=sum/3;
	
	System.out.println("Average of three numbers is = " + avg);
     }
	public static void main(String[] args)
{
	
             Average a= new Average();
 	a.data();
	a.data();
}
}
       