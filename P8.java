import java.io.*;
import java.util.*;
class P8
{
public static void main(String args[])
{
char a='z';
boolean b = Character.isDigit(a);
boolean c = Character.isLetter(a);
if(b)
System.out.println("DIGIT");
else if(c)
System.out.println("ALPHABET");
else 
System.out.println("SPECIAL CHARACTER");
}
}