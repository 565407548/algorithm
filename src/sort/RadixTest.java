package sort;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class RadixTest {   
	
	@Test
	public void testRadix() {
		int size = 10;
		Random random = new Random();
		int data[] = new int[size];
		for (int i = 0; i < size; i++) {
			data[i] = random.nextInt(1000);
		}

		Radix.radix(data, 10);

		for (int i = 1; i < size; i++) {
			assertTrue(data[i - 1] <= data[i]);
			System.out.print(data[i] + "\t");
		}
	}

}
