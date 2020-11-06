import java.util.Scanner;
public class posnegnumbers
{
  public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  int num = in.nextInt();
  int value,positive=0,negative=0,zero=0;
  for(int i=0;i<num;i++)
{
  value = in.nextInt();
  if(value>0)
  positive++ ;
   else if(value<0)
  negative++;
   else if(value==0)
  zero++;
}
  System.out.println("No. of positive integer: "+positive);
  System.out.println("No. of negative integer: "+negative);
  System.out.println("No. of zeros: "+zero);
}
}