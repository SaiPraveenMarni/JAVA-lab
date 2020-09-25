import java.util.Scanner;
class marks{
public static void main(String args[]){
int cie,see,total;
Scanner in=new Scanner(System.in);
System.out.println("Enter the CIE marks:");
cie=in.nextInt();
System.out.println("Enter the SEE marks:");
see=in.nextInt();
total=(cie+(see/2));
if(total>=90)
System.out.println("Your grade is A.");
else if(total>=80)
System.out.println("Your grade is B.");
else if(total>=60)
System.out.println("Your grade is C.");
else if(total>=50)
System.out.println("Your grade is D.");
else
System.out.println("Your grade is F.");
}
}

