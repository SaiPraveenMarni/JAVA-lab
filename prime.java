import java.util.Scanner;
class prime{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter Starting number:");
int start=in.nextInt();
System.out.println("Enter Ending number:");
int end=in.nextInt();
System.out.println("Prime numbers between are:");
int count;
for(int i=start;i<=end;i++)
{
count=0;
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
count=count+1;
}
if(count==0)
System.out.println(i+" ");
}
}
}
