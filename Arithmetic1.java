import java.util.Scanner ;
public class Arithmetic1
{
public static void main(String[] args)
{
             int first,second,add,sub,mul;
	float div;
	
	Scanner arithmetic=new Scanner(System.in);
	
	System.out.println("Enter Two Numbers : " );
		
	first=arithmetic.nextInt();
	second=arithmetic.nextInt();

	
	add=first+second;
	sub=first-second;
	mul=first*second;
	div=(float) first/second;
	
	System.out.println("Addition of two numbers are :" + add);
	System.out.println("Sustraction of two number : " + sub);
	System.out.println("Multiplication of two number :" + mul);
	System.out.println("Division of two number : " + div);
}
}