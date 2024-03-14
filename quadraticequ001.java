import java.util.Scanner;

class quadraticequ001{
public static void main (String[] args)
{
double root1,root2;
Scanner input=new Scanner(System.in);
System.out.println("enter a,b,c");
double a=input.nextDouble();
double b=input.nextDouble();
double c=input.nextDouble();
double Qd=b*b-4*a*c;
System.out.println(Qd);
if(Qd>0)
{
System.out.println("both are real and distinct");
root1=(-b+Math.sqrt(Qd)/2*a);
root2=(-b+Math.sqrt(Qd)/2*a);
}
else if(Qd==0)
{
System.out.println("roots are real and equal");
root1=root2=-b/2*a;
System.out.println("roots");
}
else
System.out.println("roots are imaginary");
}
}
