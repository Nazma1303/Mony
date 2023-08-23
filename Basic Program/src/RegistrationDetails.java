import java.util.Scanner;
public class RegistrationDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name:");
		String name=sc.nextLine();
		System.out.print("Enter your age:");
		int age=sc.nextInt();
		System.out.print("Enter your phno");
		double phno=sc.nextDouble();
		System.out.print("Enter your qualification:");
		String qualification=sc.next();
		System.out.print("Enter your email:");
		String email=sc.next();
		System.out.print("Enter your no of experiance:");
		float noofexp=sc.nextFloat();
		System.out.println("Dear  "+name+","+ "Thanks for registratering id will be mailed to"+email+"within 2 working days");

	}

}
