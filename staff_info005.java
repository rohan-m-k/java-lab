import java.util.*;
class staff
{
String name;
int staffid;
long pno;
double salary;


void staffinput()
{
Scanner sc=new Scanner(System.in);

System.out.println("enter name: ");
name=sc.nextLine();
System.out.println("enter staff id:");
staffid=sc.nextInt();
System.out.println("enter phone number:");
pno=sc.nextLong();
System.out.println("enter salary:");
salary=sc.nextDouble();
}

void staffoutput()
{
System.out.println("name is:"+name);
System.out.println("staff identity is:"+staffid);
System.out.println("phone number is:"+pno);
System.out.println("salary is:"+salary);
}
}

class teaching extends staff
{
String domain;
int no_pub;
void input_teaching(){
	super.staffinput();
	Scanner z=new Scanner(System.in);
	System.out.println("enter the domain and number of publication");
	domain=z.nextLine();
	no_pub=z.nextInt();
}
void display_teaching ()
{
	super.staffoutput();
	System.out.println("domain:"+domain+"pubilcation:"+no_pub);
}
}

class technical extends staff
{
String skill;
void input_technical()
{
	super.staffinput();
	Scanner z=new Scanner(System.in);
	System.out.println("enter the skill ");
	skill=z.nextLine();
}
void output_technical()
{
	super.staffoutput();
	Scanner z=new Scanner(System.in);
	System.out.println("skill="+skill);
}
}
	


class contract extends staff
{
int period;
void inputcontract()
{
super.staffinput();
Scanner z=new  Scanner(System.in);
System.out.println("enter the peroid ofcontact ");
period=z.nextInt();
}
void contractoutput3()
{
super.staffoutput();

System.out.println("contract pr is:"+period);
}
}

class staff_info005
{
public static void main(String args[])
{
	System.out.println("enter the teaching fields information");
teaching t1=new teaching();
t1.input_teaching();
t1.display_teaching();
System.out.println("include technical field information");
technical p1=new technical();
p1.input_technical();
p1.output_technical();
System.out.println("include contract field information");
contract c1=new contract();
c1.inputcontract();
c1.contractoutput3();
}
}

