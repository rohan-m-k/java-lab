class student
{
String name,usn,branch;
int phone;
float per;

student(String a,String b,String c,float d,int e)
{
name=a;
usn=b;
branch=c;
per=d;
phone=e;
}


void printdata()
{
System.out.println("name is ="+name);
System.out.println("usn is ="+usn);
System.out.println("branch is ="+branch);
System.out.println("percentage of student is ="+per);
System.out.println("phone is ="+phone);
}
}
class demostudent002{
public static void main(String [] args)
{
student s1=new student("Rohan","2ba22cs070","cse",91,91838921);
student s2=new student("Rohit","2ba22cs0071","cse",95,636578879);
student s3=new student("Ram","2ba22cs03340","ec",94,745478879);
s1.printdata();
s2.printdata();
s3.printdata();
}
}
