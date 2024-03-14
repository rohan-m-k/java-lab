class A extends Thread
{
public void run()
{
for(int j=0;j<=10;j++)
System.out.println("j="+j);
}
}

class B extends Thread
{
public void run()
{
for(int k=1;k<=10;k++)
System.out.println("k="+k);
}
}

class C extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
System.out.println("i="+i);
}
}

class threadpriority10
{
public static void main(String[] args)
{
A a=new A();
B b=new B();
C c=new C();

c.setPriority(Thread.MAX_PRIORITY);
b.setPriority(Thread.MIN_PRIORITY);
a.setPriority(Thread.NORM_PRIORITY);
a.start();
b.start();
c.start();
}
}
