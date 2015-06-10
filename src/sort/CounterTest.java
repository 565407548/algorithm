package sort;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

	@Test
	public void testCounter() {
		int data[];
		Random random = new Random();
		int largest = 1000;

		// only one data
		data = new int[1];
		for (int i = 0; i < 1; i++) {
			data[i] = (99);
		}
		Counter.counter(data, largest);

		for (int i = 1; i < 1; i++) {
			Assert.assertTrue(data[i - 1] <= data[i]);
		}

		// same data
		data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = (99);
		}
		Counter.counter(data, largest);

		for (int i = 1; i < 10; i++) {
			Assert.assertTrue(data[i - 1] <= data[i]);
		}

		// in order
		data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = i + 1;
		}
		Counter.counter(data, largest);

		for (int i = 1; i < 10; i++) {
			Assert.assertTrue(data[i - 1] <= data[i]);
		}

		// in order
		data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = (20 - i);
		}
		Counter.counter(data, largest);

		for (int i = 1; i < 10; i++) {
			Assert.assertTrue(data[i - 1] <= data[i]);
		}

		/**
		 * random data
		 */
		data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = random.nextInt(largest + 1);
		}
		Counter.counter(data, largest);

		for (int i = 1; i < 10; i++) {
			Assert.assertTrue(data[i - 1] <= data[i]);
		}
	}
}
