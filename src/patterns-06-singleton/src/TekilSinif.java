//Singleton Deseni
//Desenin amac� bir s�n�ftan yaln�zca bir tane nesnenin t�retilmesini sa�lamak.

public class TekilSinif {
	
	private int deger; 
	//Yap�land�r�c� methodunu private olarak tan�mlar�z. 
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
