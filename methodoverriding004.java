class A
{
void input()
{System.out.println("i am in A");
}
}

class B extends A
{
void input()
{
System.out.println("i am in B");
}
}

class methodoverriding004
{
public static void main (String args[])
{
B obj=new B();
obj.input();
A obj1=new A();
obj1.input();
}
}

