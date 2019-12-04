import java.io.*;
import java.util.*;
class P4
{
public static void main(String args[])
{
int a;
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
if(a>0)
System.out.println("POSITIVE");
else if(a<0)
System.out.println("NEGATIVE");
else
System.out.println("ZERO");
}
}