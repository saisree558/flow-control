import java.io.*;
import java.util.*;
class P17
{
public static void main(String args[])
{
int i,count=0;
if(args.length==0)
System.out.println("Please enter an integer number");
int a = Integer.parseInt(args[0]);
if(a==1)
System.out.println("1 is neither prime nor composite");
else if(a==0)
System.out.println("0 is neither prime nor composite");
else
{
for(i=1;i<=a/2;i++)
{
if(a%i==0)
count++;
}
if(count>1)
System.out.println(a+" is not a prime number");
else
System.out.println(a+" is a prime number");
}
}
} 

