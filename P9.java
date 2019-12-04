import java.io.*;
import java.util.*;
class P9
{
public static void main(String args[])
{
String gender = args[0];
int age = Integer.parseInt(args[1]);
if(gender=="female" && age>=1 && age<=58)
System.out.println("Interest = 8.2%");
else if(gender=="female" && age>=59 && age<=120)
System.out.println("Interest = 7.6%");
else if(gender=="male" && age>=1 && age<=60)
System.out.println("Interest = 9.2%");
else if(gender=="male" && age>=61 && age<=120)
System.out.println("Interest = 8.3%");
}
}