import java.util.Scanner;

class ebill
{
int cno,cmr,pmr;
String cname;
double unit;
String type;
double amt;


void input()
{
Scanner sc=new Scanner(System.in);
Scanner s=new Scanner(System.in);
System.out.println("enter the customer name");
cname=sc.nextLine();
System.out.println("enter customer number");
cno=s.nextInt();
System.out.println("current meter reading previous meter reading");
cmr=s.nextInt();
System.out.println("previous meter reading");
pmr=s.nextInt();
System.out.println("enter the type of electricity bill");
type=sc.nextLine();
unit=cmr-pmr;
}

void calc()
{
System.out.println ("enter the electricity consumed is domestic or commercial");
if(type.equals("domestic"))
{

if(unit<=100)
amt=1*unit;
else if(unit>100 && unit<=200)
amt=2.50*unit;
else if(unit>200 && unit<=500)
amt=6*unit;
else
;
}
else if(type.equals("commercial"))
{
if(unit<=100)
amt=2*unit;
else if(unit>100 && unit<=200)
amt=4.50*unit;
else if(unit>200 && unit<=500)
amt=6*unit;
else if(unit>500)
amt=7*unit;
else
System.out.println("invalid data");
}
}
void print()
{
System.out.println("name="+cname);
System.out.println("customer no ="+cno);
System.out.println("current meter reading="+cmr);
System.out.println("privious meter reading="+pmr);
System.out.println("type of bill="+type);
System.out.println("bill consumed="+unit);
System.out.println("amount has to be paid"+amt);
}


}
class ebilldemo003
{
public static void main(String[] args)
{
ebill e1=new ebill();
ebill e2=new ebill();

e1.input();
e1.calc();
e1.print();
e2.input();
e2.calc();
e2.print();
}

}
