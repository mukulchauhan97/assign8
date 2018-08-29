import java.util.Scanner;
class num
{
String a,b;
int c,d;
Scanner kb=new Scanner(System.in);
void get()
{
System.out.println("Enter two numbers:");
a=kb.next();
b=kb.next();
c=Integer.parseInt(a);
d=Integer.parseInt(b);
}
void check()
{
if(c>d)
{
System.out.println("Max:"+a);
}
else
{
System.out.println("Max:"+b);
}
}
}
class number
{
public static void main(String args[])
{
num n=new num();
n.get();
n.check();
}
}

