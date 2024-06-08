import java.util.*;
public class integer
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n=");
int n=sc.nextInt();
if(n>0)
{
System.out.println("positive");
}
else if(n<0)
{
System.out.println("negative");
}
else if(n==0)
{
System.out.println("zero");
}
else
{
System.out.println("invalid");
}
}
}
