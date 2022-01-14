package ma.education.tp1.introduction;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salle o1=new Salle();
		Salle o2=new Salle("Salle  informatique");
		Salle o3=new Salle(2,"Salle  des cours");
		
		System.out.println(o1.id);
		System.out.println(o2.nom);
		System.out.println(o3.id);
		
		Salle s5=new Laboratoire(2, "LABO", "CHIMIE");
		SalleCours s6= new SalleCours(2, "Salle 2", 20);
		SalleCours s8=s6;
	}

}
