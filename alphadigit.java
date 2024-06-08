import java.util.*;
class alphadigit
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n=");
char n=sc.next().charAt(0);
if((n>='a' && n<='z') || (n>='A' && n<='Z'))
{
System.out.println("alphabet");
}
else if(n>='0' && n<='9')
{
System.out.println("Digit");
}
else
{
System.out.println("special character");
}
}
}
