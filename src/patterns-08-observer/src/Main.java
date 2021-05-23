//Nesneler aras�nda birden �oka ba��ml�l�k tan�mlamak ve bir nesne durumunda de�i�iklik oldu�unda ba��ml�y� g�ncelleme amac� vard�r. 
public class Main {
	public static void main(String[] args) {
		Veri v = new Veri();
		PastaGrafik pasta = new PastaGrafik(v);
		CubukGrafik cubuk = new CubukGrafik(v);
		v.Attach(pasta);
		v.Attach(cubuk);
		
		v.yeniVeri();
		v.yeniVeri();
		
		v.Detach(cubuk);
		
		v.yeniVeri();
	}
}
