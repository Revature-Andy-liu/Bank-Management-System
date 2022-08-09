import java.util.Scanner;


public class Bank_System {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Enter 1-3 according to the option below\n" + "1. Employee Login\n" + "2. Customer Login\n"
					+ "3. Exit");
			System.out.println("======================================");

			int service = scan.nextInt();

			if (service == 1) {
				System.out.println("1.Employee Login\n");
				System.out.println("======================================");

				System.out.println("Enter Username:");
				
				System.out.println("Enter Password:");

				
				System.exit(0);
			}

			else if (service == 2) {
				System.out.println("2.Customer Login");
				System.exit(0);
			}

			else if (service == 3) {
				System.out.println("3.Exit");
				System.exit(0);

			}
			else {
				System.out.println("Invalid Option");
				
			}
		}
	}

}
