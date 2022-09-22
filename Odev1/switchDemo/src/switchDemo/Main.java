package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'H';

		switch (grade) {

		case 'A':
			System.out.println("Mukemmel : Gectiniz");
			break;

		case 'B':
			System.out.println("Cok Guzel : Gectiniz");
			break; //ikisini aynı yapmak istiyorsak alt alta yazıcaz.

		case 'C':
			System.out.println("Iyi : Gectiniz");
			break;

		case 'D':
			System.out.println("Fena Degil : Gectiniz");
			break;

		case 'F':
			System.out.println("Maalesef kaldınız");
			break;

		default:
			System.out.println("Gecersiz not girdiniz");
		}
	}

}
