import java.util.Scanner;
class overload
{
void add()
{
int a,b,sum;
a=30;
b=40;
sum=a+b;
}

void add(int p,int q)
{
int Sum;
Sum=p+q;
System.out.println("sum="+Sum);
}

void add(double x, double y)
{
double z=x+y;
System.out.println("sum="+z);
}
}


class sumoverload004
{
public static void main(String[] args)
{
overload d1=new overload();
d1.add();
d1.add(40,50);
}
}
