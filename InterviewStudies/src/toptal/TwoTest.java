package toptal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoTest {

	@Test
	public void testSolution() {
		Two two = new Two();
		int[] solution = two.solution(new int[]{1,0,0,0,0,1});
		int [] expected = new int[]{1,1,0,0,0,1,1};
		assertEquals(expected.length, solution.length);
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], solution[i]);
		}
	}

}
