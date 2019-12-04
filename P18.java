import java.io.*;
import java.util.*;
class P18
{
public static void main(String args[])
{
int n,i,sum=0,temp=0,count=0,r;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
temp = n;
int s = n;
while(s!=0)
{
s=s/10;
count++;
}
for(i=0;i<count;i++)
{
r = n%10;
n = n/10;
sum=sum+r;
}
System.out.println(temp+"->"+sum);
}
}