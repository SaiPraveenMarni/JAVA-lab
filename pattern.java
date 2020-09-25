import java.util.Scanner;
class pattern{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter the row value:");
int n=in.nextInt();
int k=1;
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.println("\t");
k++;
}
}
}
}