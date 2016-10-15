package toptal;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneTest {

	@Test
	public void testSolution() {
		One one = new One();
		assertEquals(2, one.solution(2, new int []{0,0}));
		assertEquals(0, one.solution(2, new int []{2,2}));
		assertEquals(0, one.solution(2, new int []{}));
		assertEquals(1, one.solution(2, new int []{0}));
		assertEquals(2, one.solution(2, new int []{0,0}));
	}

}
