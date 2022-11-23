package in.ineuron.Wrappers;

public class Wrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(10);
		Integer j = new Integer("100");
		System.out.println(i);
		System.out.println(j);
		
		// Integer i = new Integer("ten");
		// content in the string constructor should be in the form of a number only 
		//otherwise it will result in NumberFormatException
		
		Character c = new Character('a');
		System.out.println(c);
		
		// Character class contains only one constructor which can take only CHAR primitive type data 
		
		Boolean b1 = new Boolean(true);
		
		Boolean b2 = new Boolean(false);
		
		// Boolean b3 = new Boolean(True);
		
		// results in error can't find the Symbol
		
		// Boolean b4 = new Boolean(False);
		
		// java is case sensitive, for primitive type only true , false are allowed 
		
		System.out.println(b1);
		System.out.println(b2);
		
		Boolean b = new Boolean("TrUE");
		
		Boolean d = new Boolean("FaLsE");
		
		System.out.println(b);
		System.out.println(d);
		
		Boolean l = new Boolean("yes");
		
		Boolean m = new Boolean("no");
		
		System.out.println(l);
		System.out.println(m);
		
		Double z = new Double(100.04);
		
		System.out.println(z);
		
		Float f = new Float(298);
		
		System.out.println(f);
		

	}

}
