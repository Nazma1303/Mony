import java.util.Scanner;
public class BillGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("no.of pizzas bought:");
		int noofpizzas=sc.nextInt();
		System.out.print("no.of puffs bought:");
		int noofpuffs=sc.nextInt();
		System.out.print("cooldrinks bought:");
		int cooldrinks=sc.nextInt();
		System.out.println("Bill Details:");
		System.out.println("No.of pizzas:"+ noofpizzas);
		System.out.println("No of puffs:"+ noofpuffs);
		System.out.println("No of cooldrinks:"+cooldrinks);
		System.out.println("Total price="+(noofpizzas*100+noofpuffs*20+cooldrinks*10));
		System.out.println("ENJOY THE SHOW!!!");

	}

}
