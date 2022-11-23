package in.ineuron.Wrappers;

public class WrapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Integer i = new Integer(10);
		Integer I = new Integer(10);
		
		System.out.println(i.equals(I));//compares the content not the reference
		
		// Utility methods of wrapper classes
		
		//valueOf()
		
		Integer i1 = Integer.valueOf(10);  // AutoBoxing
		
		Integer i2 = Integer.valueOf("10");
		
		Double d1 = Double.valueOf(10.22);
		
		Double d2 = Double.valueOf(100);
		
		Double d3 = Double.valueOf("200.33");
		
		Boolean b = Boolean.valueOf(true);
		Boolean c = Boolean.valueOf("sreekanth");
		
		Character c1 = Character.valueOf('A');
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(b);
		System.out.println(c);
		System.out.println(c1);
		
		//  xxxxValue()
		
		Integer l = Integer.valueOf(134);
		
		System.out.println(l.byteValue());
		System.out.println(l.shortValue());
		System.out.println(l.intValue());
		System.out.println(l.longValue());
		System.out.println(l.floatValue());
		System.out.println(l.doubleValue());
		
		Character c9 = Character.valueOf('C');
		
		System.out.println(c9.charValue());
		
		Boolean b11 = Boolean.valueOf("sreekanth");
		
		System.out.println(b11.booleanValue());
		
		// parseXXXX()
		
		int i9 = Integer.parseInt("100"); // AutoUnBoxing 
		
		System.out.println(i9);
		
		boolean b4 = Boolean.parseBoolean("sreekanth");
		
		System.out.println(b4);
		
		// toString()
		
		String s1=Integer.toString(10);
		
		String s2 = Boolean.toString(false);
		
		String s3 = Character.toString('A');
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}

	
}
