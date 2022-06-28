import java.util.Scanner;
public class vote
{
  public static void main(String[] args)
  {
    int age;
	  //create scanner
	Scanner sc=new Scanner(System.in);
	System.out.print("enter your age :");//to print statement
	age=sc.nextInt();
	if(age>=18)
	System.out.print("eligible for vote");//to print statement
	else
	System.out.print("not eligible to vote");//to print statement
  }
}
