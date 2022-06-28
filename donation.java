import java.util.Scanner;
public class donation
{
  public static void main(String[] args)
  {
    int age,wgt; //declaration of variables
	Scanner sc=new Scanner(System.in); // create scanner
	System.out.print("enter your age :");//to print statement
	age=sc.nextInt();
	System.out.print("enter your weight :");//to print statement
	wgt=sc.nextInt();
	if(age>=25) // if statement
	{
	  if(wgt>=48)
	System.out.print("eligible to donate blood");//to print statement
	else
	System.out.print("not eligible to donate blood");//to print statement
	}
  }
}
