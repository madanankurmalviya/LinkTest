package tESTNGExample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGExmpOne
{
	@Test
	public void testA()
	{
		Reporter.log("Hello Sexy",true);
	}
}
