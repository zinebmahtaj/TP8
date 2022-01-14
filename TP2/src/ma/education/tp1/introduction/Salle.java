package ma.education.tp1.introduction;

 public class Salle {
	protected String nom;
	protected long id;
	
	public Salle(){
		
	}

	public Salle(String nom){
		this.nom=nom;
	
	}
	
	public Salle(long id,String nom){
		this(nom);
		this.id=id;

	}
	public   static  void affiche(long id,String nom)
    {
        System.out.println(id+" "+nom);
    }
	
}
