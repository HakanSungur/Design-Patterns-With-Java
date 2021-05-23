public class Main {

	public static void main(String[] args) {
		// TekilSinif t = new TekilSinif();
		//tekil s�n�f� newleyemedi�imiz i�in instance fonksiyonunu �a��r�yoruz. 
		//Bu desen ile s�n�f�n tek bir �rne�ine kontroll� bir eri�im sa�lan�yor. 
		
		TekilSinif t = TekilSinif.Instance();
		System.out.println(t.degerAl());
		t.degerYaz(20);
		//Bir kez daha instance istiyoruz. 
		TekilSinif u = TekilSinif.Instance();
		System.out.println(u.degerAl());
	}

}
