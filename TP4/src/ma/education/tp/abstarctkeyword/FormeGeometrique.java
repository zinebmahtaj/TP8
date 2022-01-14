package ma.education.tp.abstarctkeyword;

public abstract class FormeGeometrique {

		double surface;
		
		public abstract double calculerSurface();
		//This method requires a body instead of a semicolon that was the error
		// FormeGeometrique must be an abstract class to define abstract methods

		public void afficherSurface() {
			System.out.println(this.surface);
			}
			
}
