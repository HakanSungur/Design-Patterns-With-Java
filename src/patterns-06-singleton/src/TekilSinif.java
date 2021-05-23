//Singleton Deseni
//Desenin amacý bir sýnýftan yalnýzca bir tane nesnenin türetilmesini saðlamak.

public class TekilSinif {
	
	private int deger; 
	//Yapýlandýrýcý methodunu private olarak tanýmlarýz. 
	private TekilSinif() {
		deger = 12; 
	}
	
	public int degerAl() { return deger; }
	public void degerYaz(int a) {
		deger = a;
	}
	
	// singleton
	private static TekilSinif uniqueInstance = null;
	public static TekilSinif Instance() {
		if(uniqueInstance == null) { 
			uniqueInstance = new TekilSinif();
		}
		return uniqueInstance;
	}

}
