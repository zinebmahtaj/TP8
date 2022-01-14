package ma.education.tp2.reflection.rappel;

import java.lang.reflect.Constructor;
import java.lang.reflect.*;
import java.util.ResourceBundle;

 public class TestReflection extends ConnectionDB{

	 
public static void main(String[] args) throws ClassNotFoundException{
	
	ResourceBundle rb = ResourceBundle.getBundle("ma.education.tp2.reflection.rappel.param");
	String value = rb.getString("value");
	
	Class c = Class.forName(value);
	
	Constructor[] constrs= c.getDeclaredConstructors();
	
	constrs[0].setAccessible(true);
	
	Object o = constrs[0].newInstance(null);

}
}
