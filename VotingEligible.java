import java.util.Scanner;
public class VotingEligible
{
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter age of the candidate:");
		int age=ob.nextInt();
		if(age>=18){
		    System.out.println("Eligible to cast vote");
		}
		else{
		    System.out.println("Not Eligible To Cast Vote");
		}
	}
}
