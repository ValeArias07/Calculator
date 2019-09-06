import java.util.Scanner;

public class Calcu1
{
	public static void main (String args[])
	{
		
		Scanner nreader=new Scanner(System.in);
		Scanner sreader=new Scanner(System.in);
		
		int a;
		int re=0;
		int recon=0;
		double rem=0;
		String op=" ";
		boolean choice=false;
		
		boolean pato=true;
	
		System.out.println("Welcome to the calculator, when you want to end the process write end");
	
		while(choice !=true)	
		{
			
		a=nreader.nextInt();
		op=sreader.nextLine();
			
			if(op.equals("+")){
				re=sum(nreader,a);
				choice=opt(sreader,choice,re);
				recon=re;
				}
				else
					if(op.equals("-")){
					re=sub(nreader,a);
					choice=opt(sreader,choice,re);	
					recon=re;					
					}
				else
					if(op.equals("*")){
					re=mult(nreader,a);
					choice=opt(sreader,choice,re);
					recon=re;						
					}
				else
					if(op.equals("/")){
					rem=div(nreader,a);
					choice=opt(sreader,choice,re);	
					recon=re;
					}
				else
					if(op.equals("%")){
					rem=mod(nreader,a);
					choice=opt(sreader,choice,re);		
					recon=re;
					}
				else 
					if(op.equals("^")){
					re=pow(nreader,a);
					choice=opt(sreader,choice,re);	
					recon=re;
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
				System.out.println("last number " +re);
				choice=true;
				}
				
	return choice;
	}
	
	public static int met(Scanner nreader, boolean choice, int a, int recon, int re){
	recon=re;

		if(choice= true){
			a=recon;
			}
			else
				if(choice= false){
				a=nreader.nextInt();
				}
	return a;
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
	public static int pow(Scanner nreader, int a)
	{
		int b;
		int re=1;
		int ac=1;
		
		b=nreader.nextInt();
		
		for (int i = 0; i <b; i++) {
		ac=a*ac;
		}
		re=ac;
		System.out.println("the answer is " + re);
		return re;
	}
	
}			



