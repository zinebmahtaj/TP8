package ma.education.tp2.statickeyword;

public class Etudiant {
	long id;
	String nom;
	static int nbEtudiants;
	 public Etudiant(long id, String nom,int nb){
		 
		 this.id=id;
		 this.nom=nom;
		 nbEtudiants=nb;
	 }

}
