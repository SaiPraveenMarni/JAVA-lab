import java.util.Scanner;
public class marketbill
{
  public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  double[] rate = new double[5];
  int[] quantity = new int[5];
  System.out.println("Enter the price of the items\n");
  for(int i=0;i<5;i++)
{
  rate[i] = in.nextDouble();
  quantity[i] = in.nextInt();
}
  double subtotal=0;
  for(int i=0;i<5;i++) 
{
  subtotal=subtotal+(rate[i]*quantity[i]);
}
  System.out.println("Sub-total: "+subtotal);
  if(subtotal>=10000)
{
  subtotal=subtotal-(0.05*subtotal);
}
  else if(subtotal>=7500)
{
  subtotal=subtotal-(0.03*subtotal);
}
  else if(subtotal>=5000)
{
  subtotal=subtotal-(0.02*subtotal);
}
  System.out.println("Total: "+subtotal);
}
}