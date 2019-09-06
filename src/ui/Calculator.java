import java.util.Scanner;
import java.lang.Math;

public class Calculator
{
	public static void main (String args[])
	{
		Scanner nreader=new Scanner(System.in);
		Scanner sreader=new Scanner(System.in);
		
		int a;
		int b;
		int re=0;
		int memory []= new int[10];
		double rem=0;
		String op=" ";
		boolean choice=false;
	
		System.out.println("Welcome to the calculator, when you want to end the process write end");
			
		while(choice !=true)	
		{
			a=nreader.nextInt();
			op=sreader.nextLine();
			
			if(op.equals("+")){
				re=sum(nreader,a);
				choice=opt(sreader,choice,re);	
				}
				else
					if(op.equals("-")){
					re=sub(nreader,a);
					choice=opt(sreader,choice,re);	
					}
				else
					if(op.equals("*")){
					re=mult(nreader,a);
					choice=opt(sreader,choice,re);				
					}
				else
					if(op.equals("/")){
					rem=div(nreader,a);
					choice=opt(sreader,choice,re);	
					
					}
				else
					if(op.equals("%")){
					rem=mod(nreader,a);
					choice=opt(sreader,choice,re);		
					}
		}
	}

	public static boolean opt(Scanner sreader, boolean choice, int re)
	{	
		String op;
		choice= false;
		op=sreader.nextLine();
		if(op.equals("other")){
			System.out.println("Type other operation");
			choice=false;
			}
			else{
				if(op.equals("stop")){
				choice=true;
				}
			}
	return choice;
	}
		
	public static int sum(Scanner nreader,int a){
		int b;
		int re;
		
		b=nreader.nextInt();
		re=(a+b);
		System.out.println("The answer is " + re);
		
		return re;
	}
	public static int sub(Scanner nreader, int a)
	{
	
		int b;
		int re;
		b=nreader.nextInt();
		re=(a-b);
		System.out.println("The answer is " + re);
	
		return re;
	}
	
	public static int mult(Scanner nreader, int a)
	{

		int b;
		int re;
		b=nreader.nextInt();
		re=(a*b);
		System.out.println("The answer " + re);
	
		return re;
	}
	public static double div(Scanner nreader, int a)
	{
		int b;
		double rem;
		b=nreader.nextInt();
		rem=a/b;
		System.out.println("the answer is " + rem);
	
		return rem;
	}
	public static double mod (Scanner nreader, int a)
	{
		int b;
		double rem;
		b=nreader.nextInt();
		rem=a%b;
		System.out.println("the answer is " + rem);
	
		return rem;
	}
}




