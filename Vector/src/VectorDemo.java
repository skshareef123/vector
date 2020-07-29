import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println(v.capacity());
		for(int i=0;i<10;i++) {
			v.addElement("a");
			
		}
		System.out.println(v.capacity());
		v.addElement("a");
		System.out.println(v.capacity());
		v.addElement("a");
		System.out.println(v.capacity());
		v.addElement("a");



	}

}
