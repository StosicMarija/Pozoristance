package pozoristance;

import java.util.ArrayList;

public class Repertoar {
	private Pozoriste poz;
	private ArrayList<Predstava>predstava;
	public Repertoar(Pozoriste poz) {
		super();
		this.poz = poz;
		this.predstava = new ArrayList<Predstava>();
	}
	public void dodaj (Predstava p) {
		predstava.add(p);
	}
	public void ukloni (String nazivPredstave) {
		for (int i =0; i<predstava.size(); i ++ ) {
			if(predstava.get(i).getNaziv().equals(nazivPredstave))
				predstava.remove(i);
			
		}
	}
	@Override
	public String toString() {
		String s = "";
		s += poz.getNaziv() +  ": [\n";
		for(int i=0; i < predstava.size(); i++) {
			s += predstava.get(i).toString() + "\n";
		}
		s += "]";
		return s;
	}
	
}

