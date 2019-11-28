package Week1;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, originalNumber, remainder, result = 0;
		System.out.println("Enter number");
		number = scanner.nextInt();
		scanner.close();
		//int length = String.valueOf(result).length();
		
//if(length == 3) {
		while (true) {

			try {

				originalNumber = number;

				for (; originalNumber != 0; originalNumber /= 10) {

					remainder = originalNumber % 10;

					result = result + remainder * remainder * remainder;
				}

				if (result == number) {
					System.out.println("Yes");
				} else {
					System.out.println("No");

				}

			} catch (Exception e) {
			}

			break;
		}
//	}
	}

}
