//Command deseni bir iste�i yada komutu nesne olarak saklamak ve fonksiyonlar aras�nda parametre olarak gezmesini sa�lamakt�r. 
public class Main {

	public static void main(String[] args) {
		Menu m = new Menu();
		LambaAcKapa komut_lamba = new LambaAcKapa(new Lamba());
		Televizyon tv = new Televizyon();
		OncekiKanal komut_once = new OncekiKanal(tv);
		SonrakiKanal komut_sonra = new SonrakiKanal(tv);
		
		m.komutEkle(komut_lamba);
		m.komutEkle(komut_once);
		m.komutEkle(komut_sonra);
		
		m.menu();

	}

}
