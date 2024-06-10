import java.util.*;
class gender
{
public static void main(String[] args)
{
String gender=args[0];
int age=Integer.parseInt(args[1]);
if(gender.equals("female"))
{
  if(age>=1 && age<=58)
  {
   System.out.println("percentage of interest is 8.2%");
   }
   else if(age>=59 && age<=100)
    {
    System.out.println("percentage of interest is 9.2%");
    }
}
else if(gender.equals("male"))
   {
    if(age>=1 && age<=58)
    {
    System.out.println("percentage of interest is 8.4%");
    }
     else if(age>=59 && age<=100)
    {
    System.out.println("percentage of interest is 10.5%");
    }
  }
else{
System.out.println("Invalid");
}
}
}


