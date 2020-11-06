import java.util.Scanner;

public class indices 
{

public static void main(String[] args) 
{
 Scanner in= new Scanner(System.in);
		
   int num = in.nextInt();
   int value,sum1=0,sum2=0;
   for(int i=0;i<num;i++) 
{
   value = in.nextInt();
   if(i%2==0) 
{
   sum1=sum1+value;
}
   else 
{
    sum2=sum2+value;
}
  System.out.println("a["+i+"] = "+value);
}
   System.out.println("The Sum of Even numbers: "+sum1);
   System.out.println("The Sum of Odd numbers: "+sum2);
}
}
