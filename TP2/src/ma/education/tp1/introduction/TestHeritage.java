package ma.education.tp1.introduction;

public class TestHeritage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salle s1=new SalleCours(1, "Salle 1", 20);
		SalleCours s2= new SalleCours(2, "Salle 2", 20);
		SalleCours s3=(SalleCours)s1;
		SalleCours s4=s2;
		
		
	}

}
