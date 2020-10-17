import java.util.Scanner;
public class employee {
public static void main(String args[]) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of Employees: ");
	int n = sc.nextInt();
	double[] gross = new double[n];
	TestEmployee[] Emp = new TestEmployee[n];
	for(int i =0;i<n;i++)
 {
	Emp[i] = new TestEmployee();
	Emp[i].accept();
	gross[i] = Emp[i].calculation();
	gross[i] = Emp[i].overtime();
	}System.out.println(" ");
	for(int i=0;i<n;i++)
		Emp[i].display();
}
}
class TestEmployee{
	String empid,empname;
	double empnohrs,emphra,empbasic,empda,empit,empgross;
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name of Employee:\n ");
		this.empname = sc.nextLine();
		System.out.print("Enter the Id of Employee:\n");
		this.empid = sc.nextLine();
		System.out.print("Enter the Basic salary:\n");
		this.empbasic = sc.nextDouble();
		System.out.print("Enter the HRA(%):\n");
		this.emphra = sc.nextDouble();
		System.out.print("Enter the DA(%):\n");
		this.empda = sc.nextDouble();
		System.out.print("Enter the IT(%):\n");
		this.empit = sc.nextDouble();
		System.out.print("Enter the Overtime amount in Hours:\n");
		this.empnohrs = sc.nextDouble();
	}
	double calculation()
{ 
empgross= empbasic + empbasic*emphra + empbasic*empda - empbasic*empit;
		return empgross;}
	double overtime() {
		if(empnohrs>=200) 
			empgross +=((empnohrs-200)*100);
		else
			empgross -=((200-empnohrs)*100);
		return empgross;
		
	}
	void display() {
		System.out.println("Name of Employee:\t"+empname+"\nID:\t"+empid+"\nBasic:\t"+empbasic+"\nGross Salary:"+empgross);
	}
}

