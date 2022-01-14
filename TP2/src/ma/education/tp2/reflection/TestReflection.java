package ma.education.tp2.reflection;
import java.lang.reflect.Method;

import ma.education.tp1.introduction.*;
public class TestReflection extends Salle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TestReflection z1= new TestReflection();
		z1.id=2;
		System.out.println(z1.id);
		Class m1= Salle.class;
		Method[]z2=m1.getDeclaredMethods();
		for (int i =0;i<z2.length;i++)
        {
            System.out.println(z2[i].getName());

        }
	}
}
