package recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 24;
		int sayi2 = 12;
		int sayi3 = 2;
		int enBuyukSayi = 24;
		
		if (enBuyukSayi < sayi2) {
			enBuyukSayi = sayi2;
		}
		
		if (enBuyukSayi < sayi3) {
			enBuyukSayi = sayi3;
		}
		
		System.out.println("En buyuk sayı: " + enBuyukSayi);
	}

}
