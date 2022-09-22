package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 1;
		int remainder = number % 2;
		boolean isPrime = true;
		//System.out.println(remainder);
		
		if (number == 1) {
			System.out.println("Sayi asal degildir");
			return;
		}
		
		if (number < 1) {
			System.out.println("Gecersiz sayi");
		}
		
		for (int i = 2; i < number; i++) {
			
			if (number % 2 == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("Sayi asaldır");
		}
		else {
			System.out.println("Sayi asal degildir");
		}

	}

}
