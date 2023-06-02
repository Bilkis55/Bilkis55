import java.util.*;
public class Armstrong1
{
   void armst()
       {
	int n,sum=0,d;
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter value of N :- ");
	n=s.nextInt();
	
	int m=n;
	
	while(n!=0)
	{
	d=n%10;
	sum=((sum)+(d*d*d));
	n=n/10;
	}
	
	if(m==sum)

	{
	System.out.println("Number is Armstrong");
	}
	else
 {
	System.out.println("Number is not Armstrong");

}
}
 public static void main(String[] args){
Armstrong1 a=new Armstrong1();
a.armst();
}

}