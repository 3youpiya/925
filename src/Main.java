import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
int a,b,c,sum;
Scanner in=new Scanner(System.in);
System.out.print("please Input 1:");
a=in.nextInt();
System.out.print("please Input 2:");
b=in.nextInt();
System.out.print("please Input 3:");
c=in.nextInt();
sum=a+b+c;
System.out.printf("%d+%d-%d=%d",a,b,c,sum);

    }
}
