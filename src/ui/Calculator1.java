import java.util.Scanner;
import java.lang.Math;

public class Calculator1
{
	public static void main (String args[])
	{
		Scanner nreader=new Scanner(System.in);
		Scanner sreader=new Scanner(System.in);
		
		int a;
		int b;
		double re=0;
		double amemory []= new double[10];
		String op=" ";
		boolean choice=false;
		
		System.out.println("Welcome to the calculator, when you want to end the process write end");
			
		while(choice !=true)	
		{
			a=nreader.nextInt();
			op=sreader.nextLine();
			
			if(op.equals("+")){
				re=sum(nreader,a);
				}
				else
					if(op.equals("-")){
					re=sub(nreader,a);
					}
				else
					if(op.equals("*")){
					re=mult(nreader,a);
					}
				else
					if(op.equals("/")){
					re=div(nreader,a);
					}
				else
					if(op.equals("%")){
					re=mod(nreader,a);
					}
				else 
					if(op.equals("^")){
					re=pow(nreader,a);
					}
				else 
					if(op.equals("square")){
					re=square(nreader,a);
					}
				else 
					if(op.equals("!")){
					re=fac(nreader,a);
					}
			choice=opt(sreader,choice,re);
		}	
	}

	public static boolean opt(Scanner sreader, boolean choice, double re)
	{	
		boolean options=true;
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
		
	public static double sum(Scanner nreader,int a){
		int b;
		double re;
		
		b=nreader.nextInt();
		re=(a+b);
		System.out.println("The answer is " + re);
		
		return re;
	}
	public static double sub(Scanner nreader, int a)
	{
	
		int b;
		double re;
		b=nreader.nextInt();
		re=(a-b);
		System.out.println("The answer is " + re);
	
		return re;
	}
	
	public static double mult(Scanner nreader, int a)
	{

		int b;
		double re;
		b=nreader.nextInt();
		re=(a*b);
		System.out.println("The answer " + re);
	
		return re;
	}
	public static double div(Scanner nreader, int a)
	{
		int b;
		double re;
		b=nreader.nextInt();
		re=a/b;
		System.out.println("the answer is " + re);
	
		return re;
	}
	public static double mod (Scanner nreader, int a)
	{
		int b;
		double re;
		b=nreader.nextInt();
		re=a%b;
		System.out.println("the answer is " + re);
	
		return re;
	}
	public static double square(Scanner nreader, int a)
	{
		double re=0.0;
		double i=0.0;
		
		while(a!=(i*i)){	
		i++;
		}
		re=i;
		System.out.println("the answer is " + re);
		return re;
	}
		
	public static double pow(Scanner nreader, int a)
	{
		int b;
		double re=1.0;
		int ac=1;
		
		b=nreader.nextInt();
		
		for (int i = 0; i <b; i++) {
		ac=a*ac;
		}
		re=ac;
		System.out.println("the answer is " + re);
		return re;
	}
	public static double fac(Scanner nreader, int a)
	{
		double re=1.0;
		int ac=1;
		
		for (int i=0;i<a;i++){
			ac=ac*(a-i);
			}
		re=ac;
		System.out.println("the answer is " + re);
		
		return re;
	}
}




