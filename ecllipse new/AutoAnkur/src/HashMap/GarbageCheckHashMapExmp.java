package HashMap;

import java.util.HashMap;

public class GarbageCheckHashMapExmp
{
	public static void main(String[] args) throws InterruptedException
	{
		HashMap h = new HashMap();
		Temp t =   new Temp();
		h.put(t, "Ankur");
		System.out.println(h);
		t= null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(h);
	}

}
class Temp
{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("The Finalised Method Called");
	}
}


