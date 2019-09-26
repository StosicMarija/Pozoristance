package pozoristance;

import java.util.ArrayList;

/*Predstava je opisana nazivom, pozorištem u kojem se održava i sadrži proizvoljan broj zaposlenih koji učestvuju u realizaciji predstave. 
 * U realizaciji predstave mogu učestvovati samo zaposleni u pozorištu u kome se predstava održava, pri čemu tačno jedan reditelj,
 *  najviše dva kostimografa i proizvoljno glumaca. Predstava se stvara sa rediteljem, nakon čega se kostimografi i glumci dodaju pojedinčano. 
 *  Povravtna vrednost pri dodavanju zaposlenog je indikator uspeha. Može da se dohvati naziv predstave, 
 * da se dohvati pozorište u kojem se održava predstavva i da se sastavi tekstualni opus predstave u obliku: nazivPedstave: \n\t(Zaposleni)\n\t(Zaposleni)*/
public class Predstava {
	private String naziv;
	private Pozoriste poz;
	private ArrayList<Zaposleni>zaposleni;
	
	
	 public Predstava(String naziv, Pozoriste poz, Reditelj red) {
		super();
		this.naziv = naziv;
		this.poz = poz;
		this.zaposleni = new ArrayList<Zaposleni>();
		zaposleni.add(red);
	}
	 
	 public boolean dodaj (Glumac glu) {
		if(!(glu.getNazivP()==poz))
		return false;
		 
		 zaposleni.add(glu);
		return true;
	 
	 }
	 public boolean dodaj (Kostimograf kos) {
		 if(!(kos.getNazivP()==poz))
			 return false;
		 int brKostimografa = 0;
		 for(int i=0;i<zaposleni.size();i++)
			 if(zaposleni.get(i).imePosla().equals(kos.imePosla()))
			brKostimografa++;
			 if (brKostimografa>=2)
				 return false;
			 
			zaposleni.add(kos);
			return true;
	 
	 }

	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPoz() {
		return poz;
	}
	
		@Override
		public String toString() {
			String s = "";
			s += naziv +  ":";
			for(int i = 0; i < zaposleni.size(); i++) {
			s += "\n\t" + zaposleni.get(i).toString();
			}
			return s;
		}
	}
	
