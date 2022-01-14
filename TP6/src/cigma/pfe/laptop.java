package cigma.pfe;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class laptop {
	double price;
	
	public void Laptop(double price){
		this.price=price;
	}
	//@override
		
		public String toString() {
		return "Laptop{" +
		"price=" + price +
		'}';
		
	}
}
public class Rappel {
	public static void main(String[] args) {
	List<Laptop> l = new ArrayList<>();
	l.add(new Laptop(10));
	l.add(new Laptop(20));
	l.add(1,new Laptop(5));
	l.forEach(i-> System.out.println(i));
	}

}
@Override
public int hashCode() {
return (""+this.price).length();
} @
Override
public boolean equals(Object o) {
return this.price==((Laptop)o).price;
}
} public class Rappel {
public static void main(String[] args) {
Set<Laptop> l = new HashSet<>();
l.add(new Laptop(12.000));
l.add(new Laptop(13.6));
l.add(new Laptop(12));
l.add(new Laptop(15.4));
l.add(new Laptop(13.600));
l.add(new Laptop(13.60));
l.forEach(i-> System.out.println(i));
}
}