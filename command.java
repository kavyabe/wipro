import java.util.*;
class command 
{
public static void main(String[] args)
{
String a=args[0];
String b=args[1];
if(a.length()==0 && b.length()==0)
{
System.out.println("no values");
}
else
{
System.out.println(a +"," + b);
}
}
}