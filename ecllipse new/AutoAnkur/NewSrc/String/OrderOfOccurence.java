package String;

import java.util.ArrayList;
import java.util.Collections;

public class OrderOfOccurence {

	public static void main(String[] args) {
	ArrayList<String>list = new ArrayList<String>();
	list.add("Z");
	list.add("A");
	list.add("Y");
    for(String obj:list)
    {
    	System.out.print(obj);
    }
    System.out.println(" ");
    Collections.sort(list);
    
    for(String obj1:list)
    {
    System.out.print(obj1);
    }
	}

}
