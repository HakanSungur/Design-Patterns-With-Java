public class Main {

	public static void main(String[] args) {
		// TekilSinif t = new TekilSinif();
		//tekil sýnýfý newleyemediðimiz için instance fonksiyonunu çaðýrýyoruz. 
		//Bu desen ile sýnýfýn tek bir örneðine kontrollü bir eriþim saðlanýyor. 
		
		TekilSinif t = TekilSinif.Instance();
		System.out.println(t.degerAl());
		t.degerYaz(20);
		//Bir kez daha instance istiyoruz. 
		TekilSinif u = TekilSinif.Instance();
		System.out.println(u.degerAl());
	}

}
