package ArrayListExmp;

import java.util.ArrayList;
import java.util.Collections;

public class MethodFourCopies {

	public static void main(String[] args) {
		ArrayList <String> obj = new ArrayList <String>(Collections.nCopies(10, "Ankur Malviya"));
		System.out.println(obj);
	}
}
