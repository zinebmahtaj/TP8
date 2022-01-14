package ma.education.tp.abstarctkeyword;

public class Tesr {

	public static void main(String[] args) {
	
		FormeGeometrique f3 = new Triangle();
		FormeGeometrique f4 = new FormeGeometrique() {
		
		public double calculerSurface() {
		return 22;
		}
		};
	}
}
