package ma.education.tp2.statickeyword;

public class TestStatic {

	public static void main(String[] args) {

		Etudiant e1= new Etudiant(1, "AHMED", 20);
		Etudiant e2= new Etudiant(2, "SAID", 30);
		System.out.println(e1.id);
		System.out.println(e2.nom);
		System.out.println(Etudiant.nbEtudiants);
		System.out.println(Etudiant.nbEtudiants);
		//nbEtudiant ne change pas 
	}

}
