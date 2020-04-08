import java.util.Scanner;

public class DoWhileExample2 {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("");

		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));

		System.out.println();
		System.out.println("");
	}
}
