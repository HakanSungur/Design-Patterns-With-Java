//Fabrika Deseni
//Bir nesnenin yarat�lmas� i�in tan�mlanan soyut s�n�flara alt s�n�flar�ndan 
//bu nesnenin hangi s�n�ftan olaca��na karar verme hakk� sa�lar.
//Kod ba��ml�l���ndan kurtulmam�z� ba�lar. 
//Alt s�n�flara nesnenin geni�letilmi� bir s�r�m�n� yapma izni veririz. 

public class Main {
	public static void araba(ArabaFactory arabaFactory) {
		Araba a = arabaFactory.ArabaUret();
		System.out.println(a.marka() + " marka araba �retildi.");
	}
	
	public static void main(String[] args) {
		araba(new SahinFactory());
		araba(new MercedesFactory());
	}
}
