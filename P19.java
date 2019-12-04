import java.io.*;
import java.util.*;
class P19
{
public static void main(String args[])
{
int i,j;
if(args.length==0)
System.out.println("Please enter an integer");
else
{
int a = Integer.parseInt(args[0]);
for(i=0;i<a;i++)
{
for(j=0;j<=i;j++)
{
System.out.print("* ");
}
System.out.print("\n");
}
}
}
}