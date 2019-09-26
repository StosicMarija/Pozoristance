package pozoristance;

public abstract class Zaposleni {

		private String ime;
		private Pozoriste nazivPozorista;
		
		public Zaposleni(String ime, Pozoriste nazivP) {
			super();
			this.ime = ime;
			this.nazivPozorista = nazivP;
			
			
		}
	
		public String getIme() {
			return ime;
		}

		public Pozoriste getNazivP() {
			return nazivPozorista;
		}
		
		public abstract String imePosla ();
		
		public String toString() {
			
		return 	 ime + " (" + imePosla() + ", " +  nazivPozorista.getSkraceniNaziv() + ")";
			
		}
		
		
	}

