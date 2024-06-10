import java.util.*;
class lastletter
{
	public static boolean last(int x, int y)
	{
	int a=x%10;
	int b=y%10;
	if(a==b)
	{
	return true;
	}
	else
	{
	return false;
	}
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a=");
	int a=sc.nextInt();
	System.out.println("enter b=");
	int b=sc.nextInt();
	System.out.println(last(a,b));
	}
}

