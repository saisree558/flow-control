import java.io.*;
import java.util.*;
class P15
{
public static void main(String args[])
{
int n,i,count=0;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
for(i=1;i<=n/2;i++)
{
if(n%i==0)
count++;
}
if(count>1)
System.out.println("Not prime");
else
System.out.println("Prime");
}
}