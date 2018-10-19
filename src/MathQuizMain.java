import java.util.Scanner;

public class MathQuizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Otpoènite kviz");

		while (true) {

			int broj = (int) (Math.random() * 6) + 1;

			switch (broj) {
			case 1:
				MathQuiz.sabiranje(unos);
				break;
			case 2:
				MathQuiz.oduzimanje(unos);
				break;
			case 3:
				MathQuiz.mnozenje(unos);
				break;
			case 4:
				MathQuiz.dijeljenje(unos);
				break;
			case 5:
				MathQuiz.korjenovanje(unos);
				break;
			case 6:
				MathQuiz.kvadriranje(unos);
				break;
			}
		}
	}
}
