import java.io.*;
import java.util.*;
class P10
{
public static void main(String args[])
{
char a = 'A';
boolean b = Character.isLowerCase(a);
boolean c = Character.isUpperCase(a);
if(c)
System.out.println(a+"->"+Character.toLowerCase(a));
else if(b)
System.out.println(a+"->"+Character.toUpperCase(a));
}
}