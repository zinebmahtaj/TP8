package ma.education.tp1.introduction;

public class SalleCours extends Salle {
	byte nbplaces;
	public SalleCours(long id, String nom, int nbPlaces) {
		
		super(id, nom);
		this.nbplaces = nbplaces;	
		
	}
}
