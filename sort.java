import java.util.Scanner;
class sort
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a=");
char a=sc.next().charAt(0);
System.out.println("enter b=");
char b=sc.next().charAt(0);
if(a>b)
{
System.out.println(b +"," +a);
}
else
{
System.out.println(a +"," +b);
}
}
}

