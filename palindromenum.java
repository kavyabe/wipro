import java.util.*;
class palindromenum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n=");
int n=sc.nextInt();
int rev=0;
int temp;
temp=n;
while(n>0)
{
int digit=n%10;
rev=rev*10+digit;
n=n/10;
}
if(rev==temp)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}