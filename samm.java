import java.util.Scanner;
public class samm
{
 public static void main(String args[])
{
 Scanner in=new Scanner(System.in);
 System.out.println("Enter the numbers:");
 int num = in.nextInt();
 int a[] = new int[num];
 int b[] = new int[num];
 int value,j=0,k=0;
 for(int i=0;i<num;i++) 
{
 value = in.nextInt();
 if(value%2==0)
{
 a[j]=value;
 j++;
}
else
{
 b[k]=value;
 k++;
}
}
 int sum=0;
 int small=a[0];
 int big = a[0];
 for(int i=0;i<j;i++) 
{
 sum=sum+a[i];
 if(small>a[i]) 
{
 small = a[i];
}
 if(big<a[i]) 
{
 big = a[i];
}
}
 System.out.println("Sum of all numbers in C: "+sum);
 System.out.println("Average of all numbers in C: "+(sum/2));
 System.out.println("Smallest number in C: "+small);
 System.out.println("Largest number in C: "+big);
}
}
