import java.util.Scanner;
public class CustomerDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name:");
		String name=sc.nextLine();
		System.out.print("Enter your age:");
		int age=sc.nextInt();
		System.out.print("Enter your gender:");
		String gender=sc.next();
		System.out.print("Enter your Hailing from:");
		String hailingfrom=sc.next();
		System.out.println("Welcome, "+ name+ "!");
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("City:"+ hailingfrom);
		

	}

}
