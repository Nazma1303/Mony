import java.util.Scanner;
public class CarDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your carname:");
		String name=sc.nextLine();
		System.out.println("Enter your carno: ");
		int carno=sc.nextInt();
		System.out.println("Enter the price:");
		float price=sc.nextFloat();
		System.out.println("Carname:"+name);
		System.out.println("Carno:"+carno);
		System.out.println("Price:"+price + " rs only");

	}

}
