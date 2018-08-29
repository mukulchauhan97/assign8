interface animal
{
void speak();
void eat();
}
class dog implements animal
{
public void speak()
{
System.out.println("Bark...");
}
public void eat()
{
System.out.println("dog eating");
}
}
class cat implements animal
{
public void speak()
{
System.out.println("Meow...");
}
public void eat()
{
System.out.println("cat eating");
}
}
class code1
{
public static void main(String args[])
{
animal a;
a=new dog();
a.speak();
a.eat();
a=new cat();
a.speak();
a.eat();
}
}
