//1.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
 //Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

import java.util.Scanner;

public class Student2
{
public void data()
	{
	String name;
	int rollno;
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter your Name :-");
	System.out.println("Enter your rollno");
	
	name=s.nextLine();
	rollno=s.nextInt();
	
	System.out.println( "Name :- "+ name);
	System.out.println("Rollno:-" + rollno);
	}

    public static void main(String[] args)
        {
	Student2 s1=new Student2();
	s1.data();




}}