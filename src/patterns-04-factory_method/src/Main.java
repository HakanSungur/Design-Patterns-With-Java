//Fabrika Deseni
//Bir nesnenin yaratýlmasý için tanýmlanan soyut sýnýflara alt sýnýflarýndan 
//bu nesnenin hangi sýnýftan olacaðýna karar verme hakký saðlar.
//Kod baðýmlýlýðýndan kurtulmamýzý baðlar. 
//Alt sýnýflara nesnenin geniþletilmiþ bir sürümünü yapma izni veririz. 

public class Main {
	public static void araba(ArabaFactory arabaFactory) {
		Araba a = arabaFactory.ArabaUret();
		System.out.println(a.marka() + " marka araba Üretildi.");
	}
	
	public static void main(String[] args) {
		araba(new SahinFactory());
		araba(new MercedesFactory());
	}
}
