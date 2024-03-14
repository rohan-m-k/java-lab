class staff
{
String name;
int staffid;
long pno;
double salary;

staff (String a,int b,long c,double d)
{
name=a;
staffid=b;
pno=c;
salary=d;
}

void output()
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

teaching (String a,int b)
{
super("abc",340,4856754,234564);
domain=a;
no_pub=b;
}
void output1()
{
super.output();
System.out.println("technical domain is:"+domain);
System.out.println("technical no publicationis:"+no_pub);
}
}

class technical extends staff
{
String skill;
technical(String a)
{
super("bcd",420,324823,500000);
skill=a;
}
void output2()
{
super.output();
System.out.println("technical skill is:"+skill);
}
}

class contract extends staff
{
int pr;
contract(int a)
{
super("cde",840,8789124,600000);
pr=a;
}
void output3()
{
super.output();
System.out.println("contract pr is:"+pr);
}
}

class staff_info005
{
public static void main(String args[])
{
teaching t1=new teaching("cn",8);
t1.output1();
technical p1=new technical("hardware");
p1.output2();
contract c1=new contract(365);
c1.output3();
}
}

/*void input()
{
Scanner sc=new Scanner(System.in);
Scanner s=new Scanner(System.in);
System.out.println("enter name: ");
name=sc.nextLine();
System.out.println("enter staff id:");
staffid=s.nextInt();
System.out.println("enter phone number:");
pno=s.nextLong();
System.out.println("enter salary:");
salary=s.nextDouble();
}*/
