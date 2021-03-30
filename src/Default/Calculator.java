package Default;
package Defualt;
import java.util.Scanner;
class Claculator
{
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Enter The Value Of num1 ");
	  int num1=sc.nextInt();
	  
	  System.out.println("Enter The Value Of num2 ");
	  int num2=sc.nextInt();
       
      System.out.println("Enter The Choice ");
  	  int ch=sc.nextInt();

	  switch(ch)
		{
	  case 1:int a= add(num1,num2);
			 System.out.println("The Addtion of  "+num1+"&"+num2+"is="+a);
		     break;

	  case 2:int s= sub(num1,num2);
			 System.out.println("The Subtraction of  "+num1+"&"+num2+"is="+s);
		     break;
			 
	  case 3:int m= mul(num1,num2);
			 System.out.println("The Multiplication of  "+num1+" & "+num2+"is="+m);
		     break;
			 
	  case 4: int d=div(num1,num2);
			 System.out.println("The Division of  "+num1+" & "+num2+" is="+d);
		     break;
              

	    }


         
	   }


  public static int add(int num1,int num2) 
		{
           return num1+num2;
        }

 
  public static int sub(int num1,int num2) 
		{
           return num1-num2;
        }
		
  public static int mul(int num1,int num2) 
		{
           return num1*num2;
        }
		
  public static int div(int num1,int num2) 
		{
           return num1%num2;
        }

}




public class Claculator {

}
