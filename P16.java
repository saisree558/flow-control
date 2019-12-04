import java.io.*;
import java.util.*;
class P16
{
public static void main(String args[])
{
int i,j,count=0;
for(i=10;i<=99;i++)
{
for(j=1;j<=i/2;j++)
{
if(i%j==0)
count++;
}
if(count<=1)
System.out.println(i);
}
}
}
