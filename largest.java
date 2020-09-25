import java.util.Scanner;
class largest{
public static void main(String args[]){
int a,b,c,largest;
Scanner in=new Scanner(System.in);
System.out.println("Enter the first number:\n");
a=in.nextInt();
System.out.println("Enter the second number:\n");
b=in.nextInt();
System.out.println("Enter the third number:\n");
c=in.nextInt();
if(a>=b && a>=c)
System.out.println(a+"is the largest number.");
else if(b>=a && b>=c)
System.out.println(b+"is the largest number.");
else
System.out.println(c+"is the largest number.");
}
}