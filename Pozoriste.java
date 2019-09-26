package pozoristance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pozoriste {

		private static int genId=0;
		private int id = ++genId; 
		private String naziv;
		
		
		public Pozoriste(String naziv) {
			super();
			this.naziv = naziv;
		}
		public static int getGenId() {
			return genId;
		}
		public String getNaziv() {
			return naziv;
		}
	//	public  void getSkraceniNaziv () {
	//		Pattern p = Pattern.compile("\\b[a-zA-Z]"); 
	//     Matcher m = p.matcher(naziv); 
	//      while (m.find()) 
	//          System.out.print(m.group()); 
	  
	//        System.out.println(); 
	//	}
		public String getSkraceniNaziv() {
			String inicijali = "";
			for (String s : naziv.split(" ")) {
				inicijali += s.toUpperCase().charAt(0);
			}
			return inicijali;
		}
		
		public String toString () {
			return naziv + " [ " + genId + " ]";
		}
}
