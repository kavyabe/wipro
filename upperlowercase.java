import java.util.*;
class upperlowercase
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a=");
char a=sc.next().charAt(0);
if(Character.isLowerCase(a))
{
System.out.println(Character.toUpperCase(a));
}
else
{
System.out.println(Character.toLowerCase(a));
}
}
}