import java.util.Scanner;
import java.lang.Math;

public class Calculator
{	
	static final double π = 3.141592653589;
	
	public static void main (String args[])
	{
		/**
		This is the Method Main, in this class the program ask to the user the variable a (the first number of any operation) and the variable op (the operator).
		According the value of op, the Method main call upon a specific method to find the result of the operation. After that, the class main call up the method opt 
		to know if the user wants to do new operations or continue the flow of operations. While this happens, the array memory will gather the result of the first 
		ten operations.
		
		<b> pre: It musth be inicialized the variable int a, int b, int c, double re, String op, boolean choice, double[] memory and the Scanners nreader and sreader. </b>
		<b> post: The method main will give to the user the result of the operation.</b>
		
		*/
		Scanner nreader=new Scanner(System.in);
		Scanner sreader=new Scanner(System.in);
		
		double a;
		int b;
		int  c=0;
		double re=0;

		String op=" ";
		boolean choice=false;			
		double memory[]=new double[10];
		
		System.out.println("Welcome to the calculator.\n You can do basic operations +, -, *, /, %");
		System.out.println("And complex operations √,! ,*10 ,rad to grad, sin, cos, tan, log10, logb, nsquare \n");
		System.out.println( "After an operation, you can type: \n memory- to access to the memory. \n reset- to reset memory. \n other- to do a new operation. \n stop- to end the program.\n \nLet's start typing the numbers");
		while(choice !=true)	
		{
				a=nreader.nextDouble();
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
					if(op.equals("square")|| op.equals("√")){
					re=square(a);
					}
				else 
					if(op.equals("!")){
					re=fac(a);
					}
				else 
					if(op.equals("*10")){
					re=sciennot(nreader,a);
					}
				else 
					if(op.equals("rad")||op.equals("grad")){
						re=grad_and_rad(a,op);
					}
				else 
					if(op.equals("sin")){
						re=sin(a);
					}
				else 
					if(op.equals("cos")){
						re=cos(a);
					}
				else 
					if(op.equals("tan")){
						re=tan(a);
					}
				else 
					if(op.equals("log10")){
						re=log10(a);
					}
				else 
					if(op.equals("logb")){
						
						re=logb(nreader,a);
					}	
				else 
					if(op.equals("n square")|| op.equals("n√")){
					re=nsquare(nreader, a);
					}
			if(c>=9){
				
				memory[c]=memory[c-1];
				c=0;
				}
			
			memory[c]=re;
			choice=opt(sreader, choice, memory);
			c++;
		}
	}
		

	/** This method defines the variable choice as true in case the user wants
	to make a flow of operations and defines it as false when the user wants to 
	a new operation. In other hand, this method allow to show the memory array if the user wants.
 
	<b> pre: It musth be inicialized the boolean variable choice </b>
	<b> post: The boolean variable choice will be true or false </b>
	
	@param sreader Is the scanner that allow to read the option writed by the user.
	@param choice Is the boolean that allow continue the operations or not.
	@param memory is the Array where the results of the operations are stored.
	@return choice Is the result of the user's choice.
	
	*/
		
	public static boolean opt(Scanner sreader,boolean choice, double[] memory)
	{		
		String op;
		choice= false;
		int c=0;
			op=sreader.nextLine();
		
			if(op.equals("other")){
				System.out.println("Type other operation");
				choice=false;
			}
				else
					if(op.equals("memory")){
					while (c <= 9){
					System.out.println("Memory position "+ c + " = " + memory[c]);
					choice=false;
					c++;
					}
				}
				else
					if(op.equals("stop")){
					choice=true;
					}	
				else 
					if(op.equals("reset")){
					
						for(int i=0; i<=9; i++){
						memory[i]=0;
						}
					choice=false;
					}
					
	return choice;
	}
	
	/** This method do the sum operation, using the variable a and the variable b.
 
	<b> pre: It musth be inicialized the Scanner nreader and op="+" </b>
	<b> post: The variable re will have the solution of the sum operation</b>
	
	@param a Is the first number of the sum operation. a!=" " and a!=null.
	@param nreader the scanner allow the reading of the variable b written by the user.
	@return re It will be the solution of the operation.
	*/
	public static double sum(Scanner nreader,double a){
		int b;
		double re;
		
		b=nreader.nextInt();
		re=(a+b);
		System.out.println("The answer is " + re);
		
		return re;
	}
	/** This method do the substration operation, using the variable a and the variable b.
 
	<b> pre: It musth be inicialized the Scanner nreader and op="-" </b>
	<b> post: The variable re will have the solution of the substration operation</b>
	
	@param a Is the first number of the substration operation. a!=" " and a!=null.
	@param nreader the scanner allow the reading of the variable b written by the user.
	@return re It will be the solution of the operation.
	*/
	public static double sub(Scanner nreader, double a)
	{
	
		int b;
		double re;
		b=nreader.nextInt();
		re=(a-b);
		System.out.println("The answer is " + re);
	
		return re;
	}
	/** This method do the multiplication operation, using the variable a and the variable b.
 
	<b> pre: It musth be inicialized the Scanner nreader and op="*" </b>
	<b> post: The variable re will have the solution of the multiplication operation</b>
	
	@param a Is the first number of the multiplication operation. a!=" " and a!=null.
	@param nreader the scanner allow the reading of the variable b written by the user.
	@return re It will be the solution of the operation.
	*/
	public static double mult(Scanner nreader, double a)
	{

		int b;
		double re;
		b=nreader.nextInt();
		re=(a*b);
		System.out.println("The answer " + re);
	
		return re;
	}
	/** This method do the division operation, using the variable a and the variable b.
 
	<b> pre: It musth be inicialized the Scanner nreader and op="/" </b>
	<b> post: The variable re will have the solution of the division operation</b>
	
	@param a Is the first number of the division operation. a!=" " and a!=null.
	@param nreader the scanner allow the reading of the variable b written by the user.
	@return re It will be the solution of the operation.
	*/
	public static double div(Scanner nreader, double a)
	{
		int b;
		double re;
		b=nreader.nextInt();
		re=a/b;
		System.out.println("the answer is " + re);
	
		return re;
	}
	/** This method do the module operation, using the variable a and the variable b.
 
	<b> pre: It musth be inicialized the Scanner nreader and op="%" </b>
	<b> post: The variable re will have the module of a division between a and b </b>
	
	@param a Is the first number or the module operation. a!=" " and a!=null.
	@param nreader the scanner allow the reading of the variable b written by the user.
	@return re It will be the solution of the operation.
	*/
	public static double mod (Scanner nreader, double a)
	{
		int b;
		double re;
		b=nreader.nextInt();
		re=a%b;
		System.out.println("the answer is " + re);
	
		return re;
	}
	/** This method calculate the square root of a number.
 
	<b> pre: It musth be inicialized the Scanner nreader and op="√" </b>
	<b> post: The variable re will have the square root of a</b>
	
	@param a Is the number that be calculate it square root. a!=" " and a!=null.
	@return re It will be the solution of the operation.
	
	*/
	public static double square(double a)
	{
		double re;
		double ac;
		
		ac=a;
		
			if(ac >= 0)
			{
				for(int i=0;i<8;i++)
				a=(((a*a)+ac)/(2*a));
			}
		re=a;
		
		System.out.println("the answer is " + re);
		
		return re;
	}
	/** This method calculate the Scientific Notation (negative or possitive) of the variable a.
 
	<b> pre: It musth be inicialized the Scanner nreader and op="*10" </b>
	<b> post: The variable re will have the scientific notation of a in the b base</b>
	
	@param a Is the first number of the operation. a!=" " and a!=null.
	@param nreader the scanner allow the reading of the variable b written by the user.
	@return re It will be the solution of the operation.
	
	*/
	public static double sciennot(Scanner nreader, double a)
	{
		int b;
		double bf=1;
		double re;
		
		b=nreader.nextInt();
		
		if(b>=0){
			
			for(int i=1; i<=b; i++){
				bf=(10*bf);
			}
		}
		else
			if(b<0){
				for(int i=-1; i>=b; i--){
				bf=(bf/10);		
			}
		}
				
		re=a*bf;
		System.out.println("the answer is " + re);
		
		return re;
	}	
	/** This method convert the radians in grades or the grades in radians, using the variable a and the constant π.
 
	<b> pre: It musth be inicialized the Scanner nreader and op="grad" !! and op="rad" </b>
	<b> post: The variable re will have convertion of grades in radians or radians in grades</b>
	

	@param a Is the  number that will be convert in grades or radians. a!=" " and a!=null.
	@param op Is the isntruction to convert grades to radians or radians to grades
	@return re It will be the solution of the operation.
	
	*/
	public static double grad_and_rad(double a, String op)
	{
		double re=1;
		
		if(op.equals("rad")){
			re=(π/180);
			System.out.println("the answer in radiants is " + re);
		}
		else 
			if(op.equals("grad")){	
			re=a*(180/π);
			System.out.println("the answer in grades is " + re);
		}
		return re;
	}
	/** This method calculate the power b to the variable a.  
 
	<b> pre: It musth be inicialized the Scanner nreader and op="^" </b>
	<b> post: The variable re will have the pow of a in b </b>
	
	@param a Is the base nurmber of the power in b. a!=" " and a!=null.
	@param nreader the scanner allow the reading of the variable b written by the user.
	@return re It will be the solution of the operation.
	
	*/
	public static double pow(Scanner nreader, double a)
	{
		int b;
		double re=1.0;
		double ac=1.0;
		
		b=nreader.nextInt();
		
		for (int i = 0; i <b; i++) {
		ac=a*ac;
		}
		re=ac;
		System.out.println("the answer is " + re);
		return re;
	}
	/** This method calculate the factorial of the variable a.
 
	<b> pre: It musth be inicialized the Scanner nreader and op="!" </b>
	<b> post: The variable re will have the factorial of the variable a</b>
	
	
	@param a Is the number that will be the base of the factorial. a!=" " and a!=null.
	@return re It will be the solution of the operation.
	*/
	public static double fac(double a)
	{
		double re=1.0;
		double ac=1.0;
		
		for (int i=0;i<a;i++){
			ac=ac*(a-i);
			}
		re=ac;
		System.out.println("the answer is " + re);
		
		return re;
	}	

	/** This method calculate the Sinus of the variable a using the Math library of Java.
	
	<b> pre: It musth be inicialized the Scanner nreader and op="sin" </b>
	<b> post: The variable re will have the sinus ot fhe variable a</b>
	
	@param a Is the first number of the operation of calculate sinus. a!=" "and a!=null.
	@return re It will be the solution of the operation.
	
	*/
	public static double sin(double a)
	{
	double re;
	
	re=Math.sin(a);
	
	System.out.println("the answer is " + re);
	return re;
	}
	/** This method calculate the Cosine of the variable a using the Math library of Java.
	
	<b> pre: It musth be inicialized the Scanner nreader and op="cos" </b>
	<b> post: The variable re will have the cosine ot fhe variable a</b>
	
	@param a Is the first number of the operation of calculate cosine. a!=" " and a!=null.
	@return re It will be the solution of the operation.
	
	*/
	public static double cos(double a)
	{
	double re;
	
	re=Math.cos(a);
	
	System.out.println("the answer is " + re);
	return re;
	}
	/** This method calculate the tangent of the variable a using the Math library of Java.
	
	<b> pre: It musth be inicialized the Scanner nreader and op="tan" </b>
	<b> post: The variable re will have the tangent ot fhe variable a</b>
	
	@param a Is the first number of the operation of calculate tan. a!=" " and a!=null.
	@return re It will be the solution of the operation.
	
	*/
	public static double tan(double a)
	{
	double re;
	
	re=Math.tan(a);
	
	System.out.println("the answer is " + re);
	return re;
	}
	/** This method calculate the base 10 logarithm of the variable a using the Math library of Java.
	
	<b> pre: It musth be inicialized the Scanner nreader and op="log10" </b>
	<b> post: The variable re will have the base 10 logarithm ot fhe variable a</b>
	
	@param a Is the first number of the operation of the 10 base logarithm. a!=" " and a!=null.
	@return re It will be the solution of the operation.
	
	*/
	public static double log10(double a)
	{
	double re;
	
	re=Math.log10(a);
	
	System.out.println("the answer is " + re);
	return re;
	}
	/** This method calculate the base b logarithm of the variable a using the Math library of Java.
	
	<b> pre: It musth be inicialized the Scanner nreader and op="log10" </b>
	<b> post: The variable re will have the base 10 logarithm ot fhe variable a</b>
	
	@param a Is the first number of the operation n base log . a!=" " and a!=null.
	@param nreader the scanner allow the reading of the variable b written by the user.
	@return re It will be the solution of the operation.
	*/
	public static double logb(Scanner nreader, double a)
	{
	double re;
	int b;
	
	b=nreader.nextInt();
	
	re=Math.log(b)/Math.log10(a);
	
	System.out.println("the answer is " + re);
	return re;
	}
	/** This method calculate the n square of a number using the Math library of Java.
 
	<b> pre: It musth be inicialized the Scanner nreader and op="n√" </b>
	<b> post: The variable re will have the n square of a</b>
	
	@param a Is the number that be calculate it n square root. a!=" " and a!=null.
	@param nreader the scanner allow the reading of the variable b written by the user.
	@return re It will be the solution of the operation.
	
	*/
	public static double nsquare(Scanner nreader, double a)
	{
	double re;
	double b;
	
	b=nreader.nextInt();
	
	re=Math.pow(a,1/b);
	re=Math.ceil(re);
	
	System.out.println("the answer is " + re);
	return re;
	}
}




