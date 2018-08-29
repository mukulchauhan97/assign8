abstract class animal
{
String breed,color,name;
void speak(){}
abstract void eat();
}
class dog extends animal
{
dog()
{
breed="pug";
color="black";
name="jerry";
}
void speak()
{
System.out.println("Breed: "+breed+"nColor: "+color+"nSpeak: bark...."+"nName:"+name);
}
void eat()
{
System.out.println("dog eating...");
}
}
class cat extends animal
{
cat()
{
breed="normal";
color="white";
name="hope";
}
void speak()
{
System.out.println("Breed: "+breed+"nColor: "+color+"nSpeak: meow...."+"nName:"+name);
}
void eat()
{
System.out.println("dog eating...");
}
}
class zoo
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

