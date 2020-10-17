import java.util.Scanner;

public class age
 {
public static void main(String args[]) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age of person1(in years):");
	int y1 = sc.nextInt();
	System.out.println("Enter the age of person1(in months):");
	int m1 = sc.nextInt();
	System.out.println("Enter the age of person2(in years):");
	int y2 = sc.nextInt();
	System.out.println("Enter the age of person2(in months):");
	int m2 = sc.nextInt();
	aget a[]= new aget[2];
	a[0] = new aget(y1,m1);
	a[1] = new aget(y2,m2);
	int s = a[0].cal(a[1]);
	System.out.println("person"+(s+1)+" is elder among the both");
}
}
class aget
{
	int year,months;
	aget(int year,int months){
		this.year = year;
		this.months = months;
	}
	int cal(aget a) {
		int s;
		if(this.year >=a.year &&this.months>=a.months)
			s=0;
		else
			s=1;
		return s;
	}
}