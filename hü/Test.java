package data;

import static org.junit.Assert.*;

public class Test {
	
	KartenCheck check = new KartenCheck();
     
	
	@org.junit.Test
	public void testForPair() {
		int[] gezogeneKarten3 = { 1, 14, 25, 37, 39 }; 
		boolean result = check.checkforPairs(gezogeneKarten3, 1);
		assertEquals(true, result);

	}
	
	@org.junit.Test
	public void testForTripple() {
		int[] gezogeneKarten3 = { 1, 14, 27, 37, 39 }; 
		boolean result = check.checkforPairs(gezogeneKarten3, 2);
		assertEquals(true, result);

	}
	
	@org.junit.Test
	public void testForPoker() {
		int[] gezogeneKarten3 = { 1, 14, 27, 40, 39 }; 
		boolean result = check.checkforPairs(gezogeneKarten3, 2);
		assertEquals(true, result);

	}
	
	@org.junit.Test
	public void testRoyalFlush() {
		int[] gezogeneKarten3 = { 21, 22, 23, 24, 25 }; 
		boolean result = check.royalFlush(gezogeneKarten3, 4);
		assertEquals(true, result);

	}
	
	@org.junit.Test
	public void testForStreight() {
		int[] gezogeneKarten3 = { 28, 29, 30, 31, 32 }; 
		boolean result = check.Straﬂe(gezogeneKarten3, 4);
		assertEquals(true, result);

	}
	
	@org.junit.Test
	public void testForFlush() {
		int[] gezogeneKarten3 = { 2, 4, 5, 7, 10 }; 
		boolean result = check.Flush(gezogeneKarten3);
		assertEquals(true, result);

	}
	
	@org.junit.Test
	public void testForStreightFlush() {
		int[] gezogeneKarten3 = { 2, 3, 4, 5, 6 }; 
		boolean result = check.straightFlush(gezogeneKarten3, 4);
		assertEquals(true, result);

	}
	
	@org.junit.Test
	public void testTwoPairs() {
		int[] gezogeneKarten3 = { 9,22,30,43,50 }; 
		boolean result = check.twoPairs(gezogeneKarten3, 2);
		assertEquals(true, result);

	}
	
	
}
