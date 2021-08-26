package GPA;

import static org.junit.Assert.*;

import org.junit.Test;

public class gpaTest {

	@Test
	public void test() {
		int n=5;
		double[] marks= {90,80,70,80,90};
		
		assertEquals(8.2,8.2, CgpaCal.calc(marks,n));
		
	}

	

}
