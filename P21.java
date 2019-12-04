import java.io.*;
import java.util.*;
class P21
{
public static void main(String args[])
{
int n,r=0;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
int temp = n;
  while (n != 0)
  {
    r = r * 10;
    r = r + n%10;
    n = n/10;
  }
if(temp==r)
System.out.println(temp+" is a palindrome");
else
System.out.println(temp+" is not a palindrome");
}
}

