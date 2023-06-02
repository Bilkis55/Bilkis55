import java.util.*;



public class Fibonacci
{
public void fibbo()
{

 	int i=1;
	int n=10,first=0,second=1;

System.out.println("Fibonacci Series till " + " terms : ");

	while(i<=n)
{
	System.out.println(first + ", ");
	
	int next=first+second;
	first=second;
	second=next;

	i++;
}
}
public static void main(String[] args)
{
Fibonacci f=new Fibonacci();
f.fibbo();

}

}

	