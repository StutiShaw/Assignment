import java.util.Scanner;
public class number
{
  public static void main(String[] args)
  {
    int no;  //declare variable
	  //create scanner
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number :");//to print a statement
	no=sc.nextInt();
	if(no>0)
	System.out.print("positive number");//to print a statement
	else if(no<0)
	System.out.print("negative number");//to print a statement
	else
	System.out.println("the number is 0");//to print a statement
  }
}
