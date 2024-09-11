import java.util.Scanner;

public class DeafGrandmaApp {

	public static void main(String[] args) {

		DeafGrandmaApp app = new DeafGrandmaApp();
		app.launch();

	}

	public void launch() {
		// User prompt
		System.out.println("We're visiting grandma today, remember to speak up.");// 4
		System.out.println("Let's greet your grandma ");// 4
		Scanner scanner = new Scanner(System.in); // 1
		Grandma grandma = new Grandma();// 3

		boolean keepGoing = true;

//		grandma.canGrandmaHearYou(grandmaResponse);

		while (keepGoing) {
			String grandmaResponse = scanner.nextLine();// 2

			if (grandmaResponse.equals("GOODBYE")) {
				System.out.println("SMELL YOU LATER!");
				keepGoing = false;
			}
			else if (grandmaResponse.equals(grandmaResponse.toUpperCase())) {
				System.out.println("OH YEAH. I LOVE ALIEN TOO! ");
			} else if (grandmaResponse.equals(grandmaResponse.toLowerCase())) {
				System.out.println("HUH? SPEAK UP HONEY");
			}
		}
		scanner.close();

	}
}