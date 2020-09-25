import java.util.Scanner;
class print{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter the value n:");
int n=in.nextInt();
System.out.println("Numbers are:");
for(int i=1;i<=n;i++)
{
System.out.println(i);
}
}
}