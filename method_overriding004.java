class bank
{
int rintr;
}

class SBI extends bank
{
int get_r(int a)
{
rintr=a;
return(rintr);
}
}

class AXIS extends bank
{
int get_r(int a)
{
rintr=a;
return(rintr);
}
}

class CANARA extends bank
{
int get_r(int a)
{
rintr=a;
return (rintr);
}
}

class method_overriding3
{
public static void main(String args[])
{
SBI i=new SBI();
AXIS a=new AXIS();
CANARA c=new CANARA();
int ri=i.get_r(8);
int ri1=a.get_r(10);
int ri2=c.get_r(20);
System.out.println(ri2);
System.out.println(ri1);
System.out.println(ri);
}
}
