package stringExamples;

public class StriExmp2 {
	public static void main(String[] args) {
		   StringBuffer sb = new StringBuffer("String buffer");
			  
		   // printing the current capacity of the string buffer i.e. 16 + 14
		   System.out.println("capacity: " + sb.capacity());
		     
		   sb = new StringBuffer("A");
		      
		   // printing the current capacity of the string buffer i.e. 16 + 1
		   System.out.println("capacity: " + sb.capacity());		
	}
}

