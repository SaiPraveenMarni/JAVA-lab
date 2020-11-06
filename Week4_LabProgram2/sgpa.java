import java.util.Scanner;

class Student
{
  String USN;
  String name;
  int n;
  double SGPA = 0;
  int Credits = 0;
 Scanner in = new Scanner(System.in);

 void Details()
 {
 System.out.println("Enter USN of the student");
 USN = in.nextLine();
 System.out.println("Enter Name of the student");
 name = in.nextLine();
 System.out.println("Enter no of subjects");
 n = in.nextInt();
 int credits[] = new int[n];
 double marks[] = new double[n];
 System.out.println("Enter details of the subjects:");
 for(int i=0;i<n;i++)
 {
  System.out.println("Enter credits allotted to the subject "+(i+1));
  credits[i] = in.nextInt();
  System.out.println("Enter marks in the subject "+(i+1));
  marks[i] = in.nextInt();
  Calculate(credits[i],marks[i],i);
 }
    }
    void Calculate(int credit,double mark,int j)
    {
  Credits = Credits + credit;
  if(mark>=90&&mark<=100)
   SGPA = SGPA + (10*credit);
  else if(mark>=80 && mark<=89)
   SGPA = SGPA + (9*credit);
  else if(mark>=70&&mark<=79)
   SGPA = SGPA + (8*credit);
  else if(mark>=60&&mark<=69)
   SGPA = SGPA + (7*credit);
  else if(mark>=50 && mark<=59)
   SGPA = SGPA + (6*credit);
  else if(mark>=40&&mark<=49)
   SGPA = SGPA + (5*credit);
  else
   System.out.println("Failed in subject "+(j+1));
 }
 void Display()
 {
  System.out.println("Details of the Student");
  System.out.println("Name :"+name);
  System.out.println("USN: "+USN);
  System.out.println("SGPA of student "+(SGPA/Credits));
 }
}

public class sgpa
{
 public static void main(String args[])
 {
  Student s1 = new Student();
  s1.Details();
  s1.Display();
 }
}