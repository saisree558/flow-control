import java.io.*;
import java.util.*;
class P23
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
do
{
System.out.println("1.ADD");
System.out.println("1.SUB");
System.out.println("enter your choice");
String ch = sc.next();
switch(ch)
{
case 1: System.out.println("enter numbers to add:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = a+b;
System.out.println("SUM:"+res);
break;
case 2: System.out.println("enter numbers to add:");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int res2 = c-d;
System.out.println("DIFF:"+res2);
break;
default: System.out.println("enter a valid choice");
break;
}
}while(ch.equalsOf("y") || ch.equalsOf("Y"));
}
}
