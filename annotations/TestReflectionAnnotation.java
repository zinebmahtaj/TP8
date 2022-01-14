package ma.education.tp5.annotations;

public class TestReflectionAnnotation {

	public static void main(String[] args) {
		Class c = Calculatrice.class;
		Class c1 = CalculatriceMath.class;
		Programmer prog = (Programmer) c.getDeclaredAnnotation(Programmer.class);
		Programmer prog1 = (Programmer) c1.getAnnotation(Programmer.class);
		System.out.println(prog.id()+ " : "+ prog.name());
		System.out.println(prog1.id()+ " : "+ prog1.name());
		
		Class c2 = Calculatrice.class;
		Programmer prog2 = (Programmer) c2.getDeclaredAnnotation(Programmer.class); 
	}
}
