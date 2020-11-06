import java.util.*;
class book
{
  String name;
  String author;
  double price;
  int num_pages;
 Scanner in=new Scanner(System.in);
book()
{
System.out.println("Enter the name of the book:");
name=in.nextLine();
System.out.println("Enter the name of the author:");
author=in.nextLine();
System.out.println("Enter the price of the book:");
price=in.nextDouble();
System.out.println("Enter the no.of pages in the book:");
price=in.nextInt();
}
public String toString()
{
return("Book name:"+name+"Author:"+author+"Price:"+price+"No. of pages:"+num_pages);
}
}

class bookdetail
{
public static void main(String[] args)
{
int i,n;
Scanner in=new Scanner(System.in);
System.out.println("Enter no.of objects to be created:");
n=in.nextInt();
book obj[];
obj=new book[n];
for(i=0;i<n;i++)
{
obj[i]=new book();
}
System.out.println("The details of the books are:");
for(i=0;i<n;i++)
{
System.out.println(obj[i].toString());
}
}
}







