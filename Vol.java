import java.util.*;
class vol
{
public static void main(String[]args)
{
double pi=3.14,r,h,volume;
Scanner s =new Scanner(System.in);
System.out.println("enter the value of pi is:"+pi);
System.out.println("enter the radius");
r=s.nextDouble();
System.out.println("enter the height:");
h=s.nextDouble();
volume=pi*r*r*h;
System.out.println("The volume  ="+volume);
}
}