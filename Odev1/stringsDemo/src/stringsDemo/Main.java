package stringsDemo;

public class Main {

	public static void main(String[] args) {
	
		String mesaj = "Bugün hava cok güzel";
		
		System.out.println(mesaj);
		System.out.println("Eleman sayisi: " + mesaj.length());
		System.out.println("5.eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yasasin!"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("l"));
		char[] karekterler = new char[5];
		mesaj.getChars(0,5, karekterler,0);
		System.out.println(karekterler);
		System.out.println(mesaj.indexOf("av")); //ilk buldugunu verir
		System.out.println(mesaj.lastIndexOf("a"));//sağdan ilk verir
		
		//String 2
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim()); // boşluları atar
	
	
	}

}
