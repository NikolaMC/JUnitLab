package JUnitPackage;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class JUnitMain {
	@Test
	public void addition() {
		System.out.println("Addition test");
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1));
	}
	@Test
	public void additionFail() {
		System.out.println("Addition failing test");
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(2, 1));
	}
	@Test
	public void greater() {
		System.out.println("False test");
		GreaterThan greater = new GreaterThan();
		assertFalse(greater.isGreaterThan(5, 3));
	}
	@Test
	public void greaterFail() {
		System.out.println("False failing test");
		GreaterThan greater = new GreaterThan();
		assertFalse(greater.isGreaterThan(2, 7));
	}
	@Test
	public void intArray() {
		System.out.println("Int array test");
		int[] arr1 = {7, 5, 6, 3};
		int[] arr2 = {7, 5, 6, 3};
		assertArrayEquals(arr1, arr2);
	}
	@Test
	public void intArrayFail() {
		System.out.println("Int array failing test");
		int[] arr1 = {7, 5, 6, 3};
		int[] arr2 = {7, 8, 3, 3};
		assertArrayEquals(arr1, arr2);
	}
	@Test
	public void nullTest() {
		System.out.println("Null test");
		assertNull(null);
	}
	@Test
	public void nullTestFail() {
		System.out.println("Null failing test");
		assertNull(new Object());
	}
}
