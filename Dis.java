//Distance = (ut+ (at)^2)/2

import java.util.*;
public class Dis
{
public static void main (String[]args)
{
double u,t,a,distance;
Scanner S =new Scanner(System.in);
System.out.println("Enter the initial velocity u in(m/s):");
u=S.nextDouble();
System.out.println("Enter the time t in (s):");
t=S.nextDouble();
System.out.println("Enter the acceleration a in(m/s)^2:");
a=S.nextDouble();
distance = (u*t+(a*t)*(a*t)/2);
System.out.println("Enter the Distance d :"+distance);
}
}
 