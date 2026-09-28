import java.util.Scanner;
public class SwappingNumbers{
    public static void main(String[] args){
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a=sc.nextInt();
        System.out.print("Enter Second Number:");
        int b=sc.nextInt();
        System.out.print("Before Swapping:\n"+a+" "+b);
        temp=b;
        b=a;
        a=temp;
        System.out.print("After Swapping:\n"+a+" "+b);
        sc.close();
    }
}