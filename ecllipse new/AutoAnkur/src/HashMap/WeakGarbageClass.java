package HashMap;

import java.util.WeakHashMap;

public class WeakGarbageClass
{
	public static void main(String[] args) throws InterruptedException
	{
		WeakHashMap h = new WeakHashMap();
		Temp1 t =   new Temp1();
		h.put(t, "Ankur");
		System.out.println(h);
		t= null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(h);
	}

}
class Temp1
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


