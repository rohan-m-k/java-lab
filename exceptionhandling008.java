import java.util.Scanner;
class exceptionhandling008{
	public static void main(String []args)
	{
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the two numbers:");
		try{
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("Res="+c);
		}
		catch(Exception e)
		{
			System.out.println("arithmetic exception");
		}
	}
}
			
			
