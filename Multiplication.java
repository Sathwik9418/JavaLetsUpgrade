import java.util.Scanner;
public class Multiplication
{
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number of which multiplication table needs to be displayed:");
		int n=ob.nextInt();
		System.out.println("The multiplication table of "+n+" is:");
		for(int i=1;i<=10;i++){
		    System.out.println(n+"x"+i+"="+(n*i));
		}
	}
}
